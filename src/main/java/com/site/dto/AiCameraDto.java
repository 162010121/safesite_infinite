package com.site.dto;

import java.util.List;

import com.site.entity.AICameraEntity;

import lombok.Data;

@Data
public class AiCameraDto {
	
	private Integer count;
    private List<AICameraEntity> list;

}
