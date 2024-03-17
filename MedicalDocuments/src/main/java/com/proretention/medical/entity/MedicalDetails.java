package com.proretention.medical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	private String userKey;
	private String tenantKey;
	private String title;
	private String documentPath;
	
}
