package com.site.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Sensor_Table")
public class SensorEntity {

	@Id
	@Column(name="sensor_Id")
	private String sensorId;
	
	@Column(name="sensor_Name")
	private String sensorName;
	
	@Column(name="sensor_Type")
	private String sensorType;
	
	@Column(name="sensor_Zone")
	private String sensorZone;
	
	@Column(name="sensor_Location")
	private String sensorLocation;
	
	@Column(name="temperature")
	private Double temperature;
	
	@Column(name="humidity")
	private Double humidity;
	
	@Column(name="carbon_Monaxide")
	private Double carbonMonaxide;
	
	@Column(name="voc")
	private Double voc;
	
	@Column(name="particulate")
	private Double particulate;
	
	@Column(name="noise")
	private Double noise;
	
	@Column(name="motion")
	private Long motion;
	
	@Column(name="light")
	private Double light;
	
	@Column(name="pressure")
	private Double pressure;
	
	@Column(name="water_Level")
	private Double waterLevel;
	
	@Column(name="rainfall")
	private Double rainfall;
	
	@Column(name="battery")
	private Long battery;
	
	@Column(name="connectvity_Strength")
	private Long connectvityStrength;

}
