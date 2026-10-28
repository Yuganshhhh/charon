package com.charon.management.controller;

import com.charon.management.dto.responseDto.HealthResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final String serviceName;
    private final String serviceDescription;
    public HealthController(
            @Value("${info.server.name}") String serviceName,
            @Value("${info.server.description}") String serviceDescription
    ) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
    }


    @GetMapping
    public ResponseEntity<HealthResponseDto> health() {

        return ResponseEntity.ok(new HealthResponseDto(serviceName, serviceDescription, "UP"));
    }
}

