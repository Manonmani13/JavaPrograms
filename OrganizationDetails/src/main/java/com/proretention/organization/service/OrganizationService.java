package com.proretention.organization.service;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.proretention.organization.request.model.OrganizationDetailsRequestModel;
import com.proretention.organization.response.MessageResponse;
import com.proretention.organization.response.OrganizationDetailsResponseModel;
import com.proretention.organization.serviceimplementation.GetOrganizationResponse;

public interface OrganizationService {

	
	ResponseEntity<MessageResponse> createOrganization(OrganizationDetailsRequestModel organization);

	ResponseEntity<MessageResponse> updateByTenantKey(String tenantKey,OrganizationDetailsRequestModel organization);

	ResponseEntity<GetOrganizationResponse> getByTenantKey(String tenantKey);

	void deleteByTenantKey(String tenantKey);

	List<OrganizationDetailsResponseModel> getAllOrganization(int page, int limit);

	
	
				
}
