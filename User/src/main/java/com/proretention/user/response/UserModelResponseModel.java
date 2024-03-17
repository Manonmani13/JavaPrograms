package com.proretention.user.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModelResponseModel {
	
	private int userId;
	private String Name;
	private String designation;
	private String emailId;
	private String status;
	

}
