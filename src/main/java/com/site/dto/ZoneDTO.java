package com.site.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ZoneDTO {
	
	private String zoneName;
    private AiCameraDto aiCamera;
    private EnvironmentSensorDto environmentSensor;
    private FloodSensorDto floodSensor;
   
}
