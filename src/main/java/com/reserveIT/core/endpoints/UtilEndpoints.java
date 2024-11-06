package com.reserveIT.core.endpoints;

import com.reserveIT.core.model.ComponentHealthResponse;
import com.reserveIT.core.model.HealthCheckResponse;
import com.reserveIT.core.model.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtilEndpoints {

    // Healthcheck endpoint
    @GetMapping("/healthcheck")
    public HealthCheckResponse getHealthCheck(){
        HealthCheckResponse response = new HealthCheckResponse();
        response.setStatus(Status.UP);
        return response;
    }

}
