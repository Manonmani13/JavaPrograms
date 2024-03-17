package com.proretention.medical.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Details about the Medical Details Request ")

public class MedicalRequest {
	@ApiModelProperty(notes = "Key of the user")
	private String userKey;
	@ApiModelProperty(notes = "Key of the tenant")
	private String tenantKey;
	@ApiModelProperty(notes = "title of the document")
	private String title;
	@ApiModelProperty(notes = "path of the document")
	private String documentPath;
}
