package com.proretention.organization.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Messager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proretention.organization.request.model.OrganizationDetailsRequestModel;
import com.proretention.organization.response.MessageResponse;
import com.proretention.organization.response.OrganizationDetailsResponseModel;
import com.proretention.organization.service.OrganizationService;
import com.proretention.organization.serviceimplementation.GetOrganizationResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;




@RestController
@RequestMapping("api/organization")
public class OrganizationController {
	 Logger logger = LogManager.getLogger(OrganizationController.class);

	@Autowired
	private OrganizationService organizationService;

	@PostMapping("/createorganization")
	@ApiOperation(value="this method is used to save organization details",
	notes="give details about your organization to save",
	response=MessageResponse.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Organization created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public  ResponseEntity<MessageResponse> saveOrganizationDetails(@RequestBody OrganizationDetailsRequestModel organization)
	{
	
			logger.info("Organization saveDetailsMethod started");
			return organizationService.createOrganization(organization);
	}
	@GetMapping("/getbytenantkey/{id}")
	@ApiOperation(value="this method is used to find organization details by Key",
	notes="find details about your organization by tenantKey",
	response=GetOrganizationResponse.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "OrganizationDetails get successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public ResponseEntity<GetOrganizationResponse> getByTenantKey(@PathVariable("id")String tenantKey)
	{
		logger.info("Organization getByTenantKeyMethod started");
			return organizationService.getByTenantKey(tenantKey);
	}

	@GetMapping("/getall")
	@ApiOperation(value="this method is used to find all organization details",
	notes="find details about  all organization ",
	response=OrganizationDetailsResponseModel.class)
	public ResponseEntity<List<OrganizationDetailsResponseModel>> getAllOrganization(@RequestParam(value="page",defaultValue="1")int page,
			@RequestParam(value="limit",defaultValue="25")int limit)
	{
		logger.info("Organization getAllOrganizationMethod started");
		List<OrganizationDetailsResponseModel> orgDetailsResMod=new ArrayList<>();
		List<OrganizationDetailsResponseModel> orgDetails=organizationService.getAllOrganization(page,limit);
		for(OrganizationDetailsResponseModel  org : orgDetails)
		{
			OrganizationDetailsResponseModel orgDetailsRes=new OrganizationDetailsResponseModel();
			BeanUtils.copyProperties(org, orgDetailsRes);
			orgDetailsResMod.add(orgDetailsRes);
		}
		logger.info("Organization getByOrganizationIdMethod completed");
		return new ResponseEntity<>(orgDetailsResMod,HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	@ApiOperation(value="this method is used to update organization details",
	notes="give TenantKey  to update your organization details ",
	response=MessageResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Organization created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public  ResponseEntity<MessageResponse>  updateTenantByKey(@PathVariable("id")String tenantKey,
			@RequestBody OrganizationDetailsRequestModel organization)
	{
		logger.info("Organization updateTenantByKeyMethod started");
		
				return organizationService.updateByTenantKey(tenantKey,organization);
	}
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value="this method is used to delete organization details",
	notes="give you TenantKey  to delete your details",
	response=OperationStatusModel.class)
	public  OperationStatusModel deleteByTenantKey(@PathVariable("id") String tenantKey)
	{
		logger.info("Organization deleteByTenantKey Method started");
		OperationStatusModel opStatusModel=new OperationStatusModel();
		opStatusModel.setOperationName(RequestOperationName.DELETE.name());
		organizationService.deleteByTenantKey(tenantKey);
		opStatusModel.setOperationResult(RequestOperationStatus.Success.name());
		logger.info("Organization deleteByTenantKey Method completed");
		return  opStatusModel;
	}
}
