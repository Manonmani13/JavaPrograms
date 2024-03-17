package com.proretention.user.request;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GetResponse {

   private String userKey;
	
	private String tenantKey;
	
	private String organisationName;
	
	private String designation;
	
	private String dateOfJoining;
	
	private String lastWorkingDate;

	private String experience;

}
