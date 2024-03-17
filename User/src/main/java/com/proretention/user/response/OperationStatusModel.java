package com.proretention.user.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data

@ApiModel(description = "delete operation")
public class OperationStatusModel
{
	@ApiModelProperty(notes = "result of the operation")
	private String operationResult;
	@ApiModelProperty(notes = "operation name")
	private String operationName;

}
