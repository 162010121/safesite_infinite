package com.site.service;


import com.site.dto.LoginRequestDetails;
import com.site.dto.LoginResponseDetails;
import com.site.dto.LogoutDTO;
import com.site.dto.UserDetailDTO;
import com.site.entity.UserDetailEntity;
import com.site.util.CommonUtils.Roles;


public interface UserDetailService {


      UserDetailEntity registerUser(UserDetailDTO userDetails, Roles role);	
	  LoginResponseDetails userLogin(LoginRequestDetails loginRequestDetails); 
	  boolean userLogout(LogoutDTO dto);
	  

}
