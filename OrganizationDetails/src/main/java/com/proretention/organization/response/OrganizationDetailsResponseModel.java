package com.proretention.organization.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="Details about the Organization Details Response")
public class OrganizationDetailsResponseModel {
	
	@ApiModelProperty(notes="The unique Id for organization")
	private int organizationId;
	@ApiModelProperty(notes="Key of tenant")
	private String tenantKey;
	@ApiModelProperty(notes="Name of the organization")
	private String organization;
	@ApiModelProperty(notes="Country Name the organization")
	private String country;
	@ApiModelProperty(notes="Address of the organization")
	private String address1;
	@ApiModelProperty(notes="Address of the organization")
	private String address2;
	@ApiModelProperty(notes="CityName of  the organization")
	private String city;
	@ApiModelProperty(notes="StateName of the organization")
	private String state;
	@ApiModelProperty(notes="ZipCode of  the organization")
	private long zipCode;
	@ApiModelProperty(notes="LocationUrl of the organization")
	private String locationUrl;
	@ApiModelProperty(notes="WebsiteUrl for  organization")
	private String websiteUrl;
	@ApiModelProperty(notes="Description of your company")
	private String description;
	@ApiModelProperty(notes="Industry Details")
	private String insdustry;
	@ApiModelProperty(notes="BusinessType for organization")
	private String bussinessType;
	@ApiModelProperty(notes=" about  organization details")
	private String aboutUs;
	@ApiModelProperty(notes="created date  of the organization details")
	private String createdate;
	@ApiModelProperty(notes=" update date  of the organization details")
	private String updatedate;
	@ApiModelProperty(notes=" createdBy of the   organization details")
	private String createdBy="user";
	@ApiModelProperty(notes=" updatedBy of the   organization details")
	private String updatedBy="user";





}
