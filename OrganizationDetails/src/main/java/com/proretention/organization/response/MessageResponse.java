package com.proretention.organization.response;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MessageResponse {

	@ApiModelProperty(notes="status of save or update method")
	private int status;
	@ApiModelProperty(notes="success or failed message ")
	private String message;
	@ApiModelProperty(notes="give content of the user details")
	private OrganizationResponse content;
}
