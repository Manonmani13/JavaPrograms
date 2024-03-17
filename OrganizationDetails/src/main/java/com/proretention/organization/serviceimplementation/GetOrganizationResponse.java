package com.proretention.organization.serviceimplementation;

import org.springframework.stereotype.Component;

import com.proretention.organization.response.OrganizationDetailsResponseModel;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GetOrganizationResponse {

	@ApiModelProperty(notes="status of the get details")
	private int status;
	@ApiModelProperty(notes="message about get message success or not")
	private String message;
	@ApiModelProperty(notes="cotent for user reference")
	private OrganizationDetailsResponseModel content;
}
