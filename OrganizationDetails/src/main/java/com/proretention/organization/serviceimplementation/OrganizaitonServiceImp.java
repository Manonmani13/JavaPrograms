package com.proretention.organization.serviceimplementation;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import com.proretention.organization.entity.OrganizationDetails;
import com.proretention.organization.exception.ResourceNotFound;
import com.proretention.organization.repository.OrganizationRepository;
import com.proretention.organization.request.model.OrganizationDetailsRequestModel;
import com.proretention.organization.response.MessageResponse;
import com.proretention.organization.response.OrganizationDetailsResponseModel;
import com.proretention.organization.response.OrganizationResponse;
import com.proretention.organization.service.OrganizationService;


@Service
public class OrganizaitonServiceImp implements OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	@Autowired
	private OrganizationResponse organizationResponse;

	public static String getCurrentUtcTime() {
		String date;
		Instant instant = Instant.now();
		date = instant.toString();
		return date;
	}

	public ResponseEntity<MessageResponse> createOrganization(OrganizationDetailsRequestModel organization) {
		try {

			if (organization.getAddress1().isEmpty() || organization.getAddress2().isEmpty()
					|| organization.getTenantKey().isEmpty() || organization.getOrganization().isEmpty()
					|| organization.getCountry().isEmpty() || organization.getCity().isEmpty()
					|| organization.getState().isEmpty() || organization.getZipCode() == 0
					|| organization.getLocationUrl().isEmpty() || organization.getWebsiteUrl().isEmpty()
					|| organization.getInsdustry().isEmpty() || organization.getBussinessType().isEmpty()
					|| organization.getAboutUs().isEmpty() || organization.getDescription().isEmpty())

				throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (ResourceNotFound rs) {
			throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (Exception e) {
			throw new ResourceNotFound("some thing wrong in service");
		}
		OrganizationDetails organizationDet = new OrganizationDetails();
		
			organizationDet.setTenantKey(organization.getTenantKey());
			organizationDet.setOrganization(organization.getOrganization());
			organizationDet.setCountry(organization.getCountry());
			organizationDet.setAddress1(organization.getAddress1());
			organizationDet.setAddress2(organization.getAddress2());
			organizationDet.setAboutUs(organization.getAboutUs());
			organizationDet.setCity(organization.getCity());
			organizationDet.setState(organization.getState());
			organizationDet.setZipCode(organization.getZipCode());
			organizationDet.setLocationUrl(organization.getLocationUrl());
			organizationDet.setWebsiteUrl(organization.getWebsiteUrl());
			organizationDet.setDescription(organization.getDescription());
			organizationDet.setInsdustry(organization.getInsdustry());
			organizationDet.setBussinessType(organization.getBussinessType());
			organizationDet.setAboutUs(organization.getAboutUs());
			organizationDet.setCreatedBy("User");
			organizationDet.setUpdatedBy("User");
			organizationDet.setCreatedate(getCurrentUtcTime());
			organizationDet.setUpdatedate(getCurrentUtcTime());
			OrganizationDetails org = organizationRepository.save(organizationDet);
			organizationResponse.setData(org.getOrganizationId());
			return new ResponseEntity<MessageResponse>(
					new MessageResponse(201, "Details saved successfully", organizationResponse), HttpStatus.OK);
		
	}

	public ResponseEntity<GetOrganizationResponse> getByTenantKey(String tenantKey) {
		try {
			OrganizationDetails organizationDetails = organizationRepository.findByTenantKey(tenantKey);
			OrganizationDetailsResponseModel res=new OrganizationDetailsResponseModel();
			BeanUtils.copyProperties(organizationDetails, res);
			return new ResponseEntity<GetOrganizationResponse>(
					new GetOrganizationResponse(201, "Details saved successfully", res), HttpStatus.OK);
		
		} 
		catch (java.util.NoSuchElementException e) {
			throw new ResourceNotFound("given  id doesnot exist in DB");

		} 
		catch (IllegalArgumentException e) {
			throw new ResourceNotFound("given  tenantkey  not exist");
		} catch (Exception e) {
			throw new ResourceNotFound("something  went wrong  in service layer");
		}
	}

	public void deleteByTenantKey(String tenantKey) {
		OrganizationDetails orgDetails = organizationRepository.findByTenantKey(tenantKey);
		try {
			if (orgDetails == null)
				throw new IllegalArgumentException("Tenant key is null");
		} catch (IllegalArgumentException e) {
			throw new ResourceNotFound("give tenant key is doesnt exist in db");
		} catch (Exception e) {
			throw new ResourceNotFound("Something  went wrong  in service layer");
		}
		organizationRepository.delete(orgDetails);
	}

	@Override
	public ResponseEntity<MessageResponse> updateByTenantKey(String tenantKey,OrganizationDetailsRequestModel organization) {
		try {

			if (organization.getAddress1().isEmpty() || organization.getAddress2().isEmpty()
					|| organization.getTenantKey().isEmpty() || organization.getOrganization().isEmpty()
					|| organization.getCountry().isEmpty() || organization.getCity().isEmpty()
					|| organization.getState().isEmpty() || organization.getZipCode() == 0
					|| organization.getLocationUrl().isEmpty() || organization.getWebsiteUrl().isEmpty()
					|| organization.getInsdustry().isEmpty() || organization.getBussinessType().isEmpty()
					|| organization.getAboutUs().isEmpty() || organization.getDescription().isEmpty())

				throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (ResourceNotFound rs) {
			throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (Exception e) {
			throw new ResourceNotFound("some thing wrong in service");
		}

		OrganizationDetails organizationDet =organizationRepository.findByTenantKey(tenantKey);
		try {
			if (organizationDet == null)
				throw new ResourceNotFound("plese give correct id");
		} catch (java.util.NoSuchElementException e) {
			throw new ResourceNotFound("given  Key doesnot exist in DB");

		} catch (IllegalArgumentException e) {
			throw new ResourceNotFound("given  Key is not exist, please send some id to be searched");
		} catch (Exception e) {
			throw new ResourceNotFound("Something went wrong in Service layer while fetching all employees");
		}
		
			organizationDet.setTenantKey(organization.getTenantKey());
			organizationDet.setOrganization(organization.getOrganization());
			organizationDet.setCountry(organization.getCountry());
			organizationDet.setAddress1(organization.getAddress1());
			organizationDet.setAddress2(organization.getAddress2());
			organizationDet.setAboutUs(organization.getAboutUs());
			organizationDet.setCity(organization.getCity());
			organizationDet.setState(organization.getState());
			organizationDet.setZipCode(organization.getZipCode());
			organizationDet.setLocationUrl(organization.getLocationUrl());
			organizationDet.setWebsiteUrl(organization.getWebsiteUrl());
			organizationDet.setDescription(organization.getDescription());
			organizationDet.setInsdustry(organization.getInsdustry());
			organizationDet.setBussinessType(organization.getBussinessType());
			organizationDet.setAboutUs(organization.getAboutUs());
			organizationRepository.save(organizationDet);
			organizationResponse.setData(organizationDet.getOrganizationId());
			return new ResponseEntity<MessageResponse>(
					new MessageResponse(201, "Details saved successfully", organizationResponse), HttpStatus.OK);
	
				
	}

	@Override
	public List<OrganizationDetailsResponseModel> getAllOrganization(int page, int limit) {

		List<OrganizationDetailsResponseModel> orgResponse = new ArrayList<>();
		if (page > 0) {
			page = page - 1;
		}
		PageRequest pageableRequest = PageRequest.of(page, limit);


		Page<OrganizationDetails> orgPage = organizationRepository.findAll(pageableRequest);
		List<OrganizationDetails> organization = orgPage.getContent();
		for (OrganizationDetails orgDetails : organization) {
			OrganizationDetailsResponseModel orgDto = new OrganizationDetailsResponseModel();
			BeanUtils.copyProperties(orgDetails, orgDto);
			orgResponse.add(orgDto);
		}

		return orgResponse;
	}

}
