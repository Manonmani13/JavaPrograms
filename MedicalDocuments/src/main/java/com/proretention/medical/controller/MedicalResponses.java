package com.proretention.medical.controller;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ApiModel(description = "Details about the Response for post and update methods ")
public class MedicalResponses {
	@ApiModelProperty(notes = "document id response ")
	private int data;
}
