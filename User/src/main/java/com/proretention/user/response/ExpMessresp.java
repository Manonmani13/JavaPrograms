package com.proretention.user.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.proretention.user.entity.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class ExpMessresp {

	private int status;
	
	private String message;
	
	private int records;
	
	private List<Experience> list;
}
