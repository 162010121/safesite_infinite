package com.site.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FloodDto {

	private String sensorId;

	private String sensorName;

	private String sensorType;

	private String sensorZone;

	private String sensorLocation;

	private Double temperature;

	private Double humidity;

	private Double carbonMonaxide;

	private Double voc;

	private Double particulate;

	private Double noise;

	private Long motion;

	private Double light;

	private Double pressure;

	private Double waterLevel;

	private Double rainfall;

	private Long battery;

	private Long connectvityStrength;

}
