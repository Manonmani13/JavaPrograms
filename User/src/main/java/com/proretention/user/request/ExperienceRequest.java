package com.proretention.user.request;


//import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceRequest{
	
    private String userKey;
	
	private String tenantKey;
	
	private String organisationName;
	
	private String designation;
	
	private String dateOfJoining;
	
	private String lastWorkingDate;

	private String experience;
}
