package com.site.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CameraDto {
	
	
	private String cameraId;

	private String cameraName;

	private String cameraZone;

	private String cameraLocation;
	
	private Long motion;

	private Long connectivityStrength;

}
