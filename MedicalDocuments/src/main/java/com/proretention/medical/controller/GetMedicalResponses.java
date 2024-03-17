package com.proretention.medical.controller;

import org.springframework.stereotype.Component;

import com.proretention.medical.response.MedicalResponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ApiModel(description = "Details about the Medical Responses for get methods")
public class GetMedicalResponses {
	@ApiModelProperty(notes = "status of the get details")
	private int status;
	@ApiModelProperty(notes = " success or not message for get method")
	private String message;
	@ApiModelProperty(notes = "cotent for user reference")
	private MedicalResponse content;
}
