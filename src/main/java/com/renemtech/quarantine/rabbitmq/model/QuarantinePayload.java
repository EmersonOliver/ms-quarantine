package com.renemtech.quarantine.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuarantinePayload {

    private CallerDataDetailsResponse callQuarantine;

}
