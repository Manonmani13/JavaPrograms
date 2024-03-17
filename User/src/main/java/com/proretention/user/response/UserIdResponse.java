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
@ApiModel(description = " response")
public class UserIdResponse 
{
	@ApiModelProperty(notes = "userId")
	private int data;

}
