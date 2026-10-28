package com.charon.analytics.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HealthResponseDto {
    private String serviceName;
    private String serviceDescription;
    private String serviceStatus;
}
