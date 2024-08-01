package com.renemtech.quarantine.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CallerDataDetailsResponse {

    private String receiveNumber;
    private String callerNumber;
    private String carrier;
    private Long callerLocation;
    private UUID callId;
    private Double callerLatitude;
    private Double callerLongitude;
    private String callerDeviceModel;
    private String callerDeviceImei;
    private String callerAreaCode;
    private Date callDhStart;
    private Date callDhEnd;
    private String callDuration;
    private String callType;
    private String callStatus;

}