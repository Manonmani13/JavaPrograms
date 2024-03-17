package com.proretention.user.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EducationRequest 
{
	private String userKey;
	private String tenantKey;
	private String course;
	private String specialization;
	private String institution;
	private String duration;
	private int yearOfPassing;
	private double percentage;
	private String certificateName;
	private String filePath;
	}
