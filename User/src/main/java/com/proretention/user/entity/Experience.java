package com.proretention.user.entity;


import java.io.Serializable;

//import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(description = "WorkExperience")
@Table(name = "Experience")
public class Experience implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "Unique Id")
	@Column(name = "expid")
	private int expId;
	
//	@ApiModelProperty(notes = "UserKey")
//	@Column(name = "userkey")
//	private String userKey;
//	
//	@ApiModelProperty(notes = "TenantKey")
//	@Column(name = "tenantkey")
//	private String tenantKey;
	
	@ApiModelProperty(notes = "OrganisationName")
	@Column(name = "organisationname")
	private String organisationName;
	
	@ApiModelProperty(notes = "Designation")
	@Column(name = "designation")
	private String designation;
	
	@ApiModelProperty(notes = "DateOfJoining")
	@Column(name = "dateofjoining")
	private String dateOfJoining;
	
	@ApiModelProperty(notes = "LastWorkingDate")
	@Column(name = "lastworkingdate")
	private String lastWorkingDate;

	@ApiModelProperty(notes = "Experience")
	@Column(name = "experience")
	private String experience;
	
	
}
