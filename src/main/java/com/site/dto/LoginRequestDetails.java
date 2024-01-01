package com.site.dto;

import lombok.Data;

@Data
public class LoginRequestDetails {

	private String email;

	private String passWord;
	
	private String deviceToken;
}
