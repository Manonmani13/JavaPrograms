package com.proretention.user.request;

import java.io.Serializable;
import java.util.List;

import com.proretention.user.entity.EducationModel;
import com.proretention.user.entity.Experience;
import com.proretention.user.entity.MedicalDetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description = "user details request fields")
public class UserRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes = "the unique userkey")
	private String userKey;
	@ApiModelProperty(notes = "tenantid")
	private String tenantKey;
	@ApiModelProperty(notes = "user's first name")
	private String firstName;
	@ApiModelProperty(notes = "user's last name")
	private String lastName;
	@ApiModelProperty(notes = "user's emailpersonal")
	private String emailPersonal;
	@ApiModelProperty(notes = "users'date of birth")
	private String dateOfBirth;
	@ApiModelProperty(notes = "user's father name")
	private String fatherName;
	@ApiModelProperty(notes = "user's mother name")
	private String motherName;
	@ApiModelProperty(notes = "user's address")
	private String address;

	private List<EducationModel> education;
	private List<Experience> experience;

	@ApiModelProperty(notes = "users's phone number")
	private String phone;
	@ApiModelProperty(notes = "user's designation")
	private String designation;
	@ApiModelProperty(notes = "user's reporting manager")
	private String reportingManager;
	@ApiModelProperty(notes = "user's email official")
	private String emailOfficial;
	@ApiModelProperty(notes = "user's employee id")
	private String employeeId;
	@ApiModelProperty(notes = "user's branch")
	private String branch;
	@ApiModelProperty(notes = "user's date of joining")
	private String dateOfJoining;
	@ApiModelProperty(notes = "user's over all experience")
	private String overAllExperience;
	@ApiModelProperty(notes = "employee role")
	private String employeeRole;
	@ApiModelProperty(notes = "any surgery")
	private String anySurgery;
	@ApiModelProperty(notes = "surgeryDetails")
	private String surgeryDetails;
	@ApiModelProperty(notes = "isFirstAidRequired")
	private String isFirstAidRequired;
	@ApiModelProperty(notes = "firstAidDetails")
	private String firstAidDetails;
	private List<MedicalDetails> medical;
	// private UserEntity model;
}
