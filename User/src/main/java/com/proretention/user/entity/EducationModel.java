package com.proretention.user.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class EducationModel implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="certid")	
	private int certId;
	
//	@Column(name="userkey")	
//	private String userKey;
//	
//	@Column(name="tenantkey")	
//	private String tenantKey;
	
	@Column(name="course")	
	private String course;

	@Column(name="specialization")	
	private String specialization;
	
	@Column(name="institution")	
	private String institution;
	
	@Column(name="duration")	
	private String duration;
	
	@Column(name="yearofpassing")	
	private int yearOfPassing;
	
	@Column(name="percentage")	
	private double percentage;
	
	@Column(name="certificatename")	
	private String certificateName;
	
	@Column(name="filepath")	
	private String filePath;
	
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
