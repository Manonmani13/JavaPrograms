package com.proretention.medical.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Details about the Medical Details Response for save and update method ")
public class MessageResponse {
	@ApiModelProperty(notes = "status of save or update method")
	private int status;
	@ApiModelProperty(notes = "success or failed message")
	private String message;
	@ApiModelProperty(notes = "response of the  save or update method")
	private MedicalResponses content;
}
