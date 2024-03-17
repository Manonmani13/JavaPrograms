package com.proretention.organization.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor

@Entity
@Table(name = "Organization")
public class OrganizationDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int organizationId;
	private String tenantKey;
	private String organization;
	private String country;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private long zipCode;
	private String locationUrl;
	private String websiteUrl;
	private String description;
	private String insdustry;
	private String bussinessType;
	private String aboutUs;
	private String createdate;
	private String updatedate;
	private String createdBy = "user";
	private String updatedBy = "user";

}
