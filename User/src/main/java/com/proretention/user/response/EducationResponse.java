package com.proretention.user.response;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

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

@Component
public class EducationResponse 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int certId;

	@Column(name="createddate")	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name="updateddate")	
	@UpdateTimestamp
	private LocalDateTime  updateDate;

	@Column(name="createdby")	
	private String createdBy = "admin";

	@Column(name="updatedby")	
	private String updatedBy = "admin";

	}
