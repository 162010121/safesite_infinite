package com.site.dto;

import java.util.List;

import com.site.entity.SensorEntity;

import lombok.Data;

@Data
public class EnvironmentSensorDto {

	private Integer count;
	private List<SensorEntity> list;

}
