package com.proretention.user.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Details about the Medical Details Response ")

public class MedicalResponse {
	@ApiModelProperty(notes = "Id of the document")
	private int documentId;
	@ApiModelProperty(notes = "Key of the user")
	private String userKey;
	@ApiModelProperty(notes = "Key of the tenant")
	private String tenantKey;
	@ApiModelProperty(notes = "Title of the document")
	private String title;
	@ApiModelProperty(notes = "Path of the Document")
	private String documentPath;
}
