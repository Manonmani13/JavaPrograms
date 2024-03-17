package com.proretention.organization.request.model;

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
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description="Details about the Organization Details Request ")
public class OrganizationDetailsRequestModel {

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

	
}
