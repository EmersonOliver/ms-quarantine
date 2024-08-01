package com.renemtech.quarantine.resources;

import com.renemtech.quarantine.model.QuarantineEntity;
import io.quarkus.panache.common.Parameters;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("quarantine")
public class QuarantineResource {


    @GET
    @Path("device")
    public Response callQuarantine(@QueryParam("deviceId") String deviceId) {
        return Response.status(Response.Status.OK)
                .entity(QuarantineEntity.find("callerDeviceImei =:device", Parameters.with("device", deviceId))
                        .list()).build();
    }
}
