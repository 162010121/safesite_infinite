package com.site.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Notification_Table")
@Data
public class NotificationEntity {
	
	@Id
	@Column(name="notification_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String notificationId;
	
	@Column(name="notification_Type")
	private String notificationType;
	
	@Column(name="notification_Zone")
	private String notificationZone;
	
	@Column(name="location")
	private String  location;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="DateAndTime")
	private Date dateAndTime;
	
	@Column(name="sensor_Id")
	private Long sensorId;
	
	@Column(name="sensor_Name")
	private String sensorName;
	
	@Column(name="camera_Id")
	private Long cameraId;
	
	@Column(name="camera_Name")
	private String cameraName;
	
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
