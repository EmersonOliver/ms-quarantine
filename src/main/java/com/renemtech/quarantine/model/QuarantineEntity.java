package com.renemtech.quarantine.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "quarantine")
public class QuarantineEntity extends PanacheEntityBase {

    @Id
    @Column(name = "id_quarantine")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idQuarantine;

    @Column(name = "receiver_number")
    private String receiveNumber;

    @Column(name = "caller_number")
    private String callerNumber;

    @Column(name = "carrier")
    private String carrier;

    @Column(name = "caller_location")
    private Long callerLocation;

    @Column(name = "call_id")
    private UUID callId;

    @Column( name = "caller_latitude")
    private Double callerLatitude;

    @Column(name = "caller_longitude")
    private Double callerLongitude;

    @Column(name = "caller_device_model")
    private String callerDeviceModel;

    @Column(name = "caller_device_imei")
    private String callerDeviceImei;

    @Column(name = "caller_area_code")
    private String callerAreaCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "call_dh_start")
    private Date callDhStart;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "call_dh_end")
    private Date callDhEnd;

    @Column(name = "call_duration")
    private String callDuration;

    @Column(name = "call_type")
    private String callType;

    @Column(name = "call_status")
    private String callStatus;








}
