package com.renemtech.quarantine.rabbitmq.consumer;

import com.renemtech.quarantine.model.QuarantineEntity;
import com.renemtech.quarantine.rabbitmq.model.CallerDataDetailsResponse;
import com.renemtech.quarantine.rabbitmq.model.QuarantinePayload;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import java.util.Date;
import java.util.Optional;

@ApplicationScoped
public class QuarantineConsumer {

    @Transactional
    @Incoming("topic-call-quarantine")
    public void consumerQuarantine(JsonObject message) {
        Optional<QuarantinePayload> payload = Optional.of(message.mapTo(QuarantinePayload.class));
         payload.map(QuarantinePayload::getCallQuarantine)
                 .ifPresent(p-> QuarantineEntity.builder()
                         .carrier(p.getCarrier())
                         .callStatus(p.getCallStatus())
                         .callType(p.getCallType())
                         .callDhStart(p.getCallDhStart())
                         .callDhEnd(p.getCallDhEnd())
                         .callDuration(p.getCallDuration())
                         .callerAreaCode(p.getCallerAreaCode())
                         .callerDeviceImei(p.getCallerDeviceImei())
                         .callId(p.getCallId())
                         .callerLatitude(p.getCallerLatitude())
                         .callerLocation(p.getCallerLocation())
                         .callerLongitude(p.getCallerLongitude())
                         .callerDeviceModel(p.getCallerDeviceModel())
                         .receiveNumber(p.getReceiveNumber())
                         .callerNumber(p.getCallerNumber())
                         .build()
                         .persist());

    }
}
