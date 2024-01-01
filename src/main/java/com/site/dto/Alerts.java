package com.site.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Alerts {

	private Integer alertCount;
	private List<NotificationFieldsDTO> alertsList;

}
