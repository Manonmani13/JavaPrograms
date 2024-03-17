package com.proretention.user.response;

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
@ApiModel(description = "UserMessage Response")
public class UserMessageResponse
{
	@ApiModelProperty(notes = "Status")
	private int status;

	@ApiModelProperty(notes = "message")
	private String message;

	@ApiModelProperty(notes = "Contant")
	private UserIdResponse content;

}
