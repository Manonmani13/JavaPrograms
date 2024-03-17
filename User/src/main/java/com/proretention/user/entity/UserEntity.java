package com.proretention.user.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private int userId;

	@Column(name = "userkey")
	private String userKey;

	@Column(name = "tenantkey")
	private String tenantKey;
	
	private String status ="in active";

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "emailpersonal")
	private String emailPersonal;

	@Column(name = "dateofbirth")
	private String dateOfBirth;

	@Column(name = "fathername")
	private String fatherName;

	@Column(name = "mothername")
	private String motherName;

	@Column(name = "address")
	private String address;
	
	 @OneToMany(cascade = CascadeType.ALL,targetEntity=EducationModel.class,fetch = FetchType.LAZY)
	 @JoinColumn(name = "userKey",referencedColumnName = "userkey")
	 @JoinColumn(name = "tenantkey",referencedColumnName = "tenantkey")
	 @JoinColumn(name = "status",referencedColumnName = "status")
	private List<EducationModel> education;
	 
	 @OneToMany(cascade = CascadeType.ALL,targetEntity=Experience.class,fetch = FetchType.LAZY)
	 @JoinColumn(name = "userkey",referencedColumnName = "userkey")
	 @JoinColumn(name = "tenantkey",referencedColumnName = "tenantkey")
	 @JoinColumn(name = "status",referencedColumnName = "status")
	 private List<Experience> experience;

	@Column(name = "phone")
	private String phone;

	@Column(name = "designation")
	private String designation;

	@Column(name = "reportingmanager")
	private String reportingManager;

	@Column(name = "emailofficial")
	private String emailOfficial;

	@Column(name = "employeeid")
	private String employeeId;

	@Column(name = "branch")
	private String branch;

	@Column(name = "dateofjoining")
	private String dateOfJoining;

	@Column(name = "overallexperience")
	private String overAllExperience;

	@Column(name = "employeerole")
	private String employeeRole;

	@Column(name = "anysurgery")
	private String anySurgery;

	@Column(name = "surgerydetails")
	private String surgeryDetails;

	@Column(name = "isfirstaidrequired")
	private String isFirstAidRequired;

	@Column(name = "firstaiddetails")
	private String firstAidDetails;
	
	 @OneToMany(cascade = CascadeType.ALL,targetEntity=MedicalDetails.class,fetch = FetchType.LAZY)
	 @JoinColumn(name = "userKey",referencedColumnName = "userkey")
	 @JoinColumn(name = "tenantkey",referencedColumnName = "tenantkey")
	 @JoinColumn(name = "status",referencedColumnName = "status")
	private List<MedicalDetails> medical;

}
