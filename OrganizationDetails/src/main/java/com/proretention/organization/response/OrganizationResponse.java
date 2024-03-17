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
public class OrganizationResponse {

	@ApiModelProperty(notes="data for user")
	private int data;
}
