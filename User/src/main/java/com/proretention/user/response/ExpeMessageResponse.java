package com.proretention.user.response;

import org.springframework.stereotype.Component;

import com.proretention.user.request.GetResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class ExpeMessageResponse {

	private int status;
	private String message;
    private GetResponse data;
}
