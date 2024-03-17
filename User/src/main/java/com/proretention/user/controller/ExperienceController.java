package com.proretention.user.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.proretention.user.entity.Experience;
import com.proretention.user.request.ExperienceRequest;
import com.proretention.user.response.ExpMessageResponse;
import com.proretention.user.response.ExpMessresp;
import com.proretention.user.response.ExpeMessageResponse;
import com.proretention.user.serviceimpl.ExperienceServiceImplementation;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("api/user")
public class ExperienceController{
	
	Logger logger = LogManager.getLogger(ExperienceController.class);
	
	@Autowired
     ExperienceServiceImplementation service;
	
	@GetMapping("/getexperiencedetails/{Id}")
	@ApiOperation(value = "Find ExperienceDetails By Id" , 
                  notes = "Provide Id to look up the specific Details in the table",
                   response = Experience.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ExperienceDetails fetched by Id successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	

	public ResponseEntity<ExpeMessageResponse> getDetailsById(@ApiParam(value = "Id value of the ExperienceDetails you need to retrieve" ,
                                           required = true)@PathVariable int Id) {
		
		logger.info("/Get By Id");
		return service.getById(Id);
		}
	
	@PostMapping("/createexperiencedetails")
	@ApiOperation(value = "Enter ExperienceDetails")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ExperienceDetails created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	                      
	public ResponseEntity<ExpMessageResponse> enterExperienceDetails(@RequestBody ExperienceRequest request) {
		
		logger.info("/api to save ExperienceDetails");
		return service.createMethod(request);
		
	}
	
    @PutMapping("/updateexperiencedetails/{id}")
	@ApiOperation(value = "Update ExperienceDetails using Id",
                  notes = "Update ExperienceDetails to get updated in the table",
                  response = Experience.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ExperienceDetails Updated successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	
	public ResponseEntity<ExpMessageResponse> updateExperienceDetails(@ApiParam(value = "Id value of the Detail you need to update" , required = true)@PathVariable int id ,@RequestBody ExperienceRequest request) {
	
		logger.info("/Update By Id");
		 ResponseEntity<ExpMessageResponse> ref = service.updateByExpId(id , request);
		 return ref;

		
	}
	 
	@DeleteMapping(path="/deleteexperiencedetails/{id}")
	@ApiOperation(value = "Delete ExperienceDetails using Id",
                   notes = "Delete ExperienceDetails to get Deleted in the table",
                   response = Experience.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ExperienceDetails deleted successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public ResponseEntity<ExpMessageResponse> deleteExperienceDetails(@ApiParam(value = "Id value of the Detail you need to Delete" , required = true)
	                                            @PathVariable int id) {
		

		logger.info("Delete By id");
		return service.deleteById(id);

	}
	
	
	@GetMapping("/getallexperiencedetails")
 	@ApiOperation(value = "Get All ExperienceDetails",
                  notes = "Get the list of Details sorted by Pagination",
                    response = Experience.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ExperienceDetails fetched successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public  ResponseEntity<ExpMessresp> getContactDetails(@RequestParam(value="page", defaultValue="1") int page, 
			                                                   @RequestParam(value="limit", defaultValue="25") int limit) 
	{
		logger.info("/Get All");
		return service.getAllDetails(page,limit);
		}
	}

