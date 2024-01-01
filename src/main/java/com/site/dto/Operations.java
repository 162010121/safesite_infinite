package com.site.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Operations {

	private Integer optCount;
	private List<NotificationFieldsDTO> operationsList;
	
}
