package com.proretention.user.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.proretention.user.request.EducationRequest;
import com.proretention.user.response.EducationResponse;
import com.proretention.user.response.MessageResponse;
import com.proretention.user.serviceimpl.EducationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api/user")

public class EducationController 
{
	@Autowired
	private EducationService educationService;
    Logger logger = LogManager.getLogger(EducationController.class);

	
	@GetMapping("/geteducationdetails/{id}")
	@ApiOperation(value = "Get education details by id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Education details read successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })	

	public ResponseEntity<MessageResponse> fetchById(@PathVariable Integer id,@RequestBody EducationRequest educationRequest) {
		logger.info("/fetchById/{id}");
		ResponseEntity<MessageResponse> fetchById = educationService.fetchById(id,educationRequest);
		logger.info("/fetchById/{id}");
		return fetchById;
		}

	@PostMapping("/createeducationdetails")
	@ApiOperation(value = "create education details")
	@ApiResponses(value = { @ApiResponse(code = 200, message ="Education created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })

	public ResponseEntity<MessageResponse> saveRegistration(@RequestBody EducationRequest educationRequest) {
		logger.info("/post");
		ResponseEntity<MessageResponse> saveRegistration = educationService.saveRegistration(educationRequest);
		logger.info("/post");
		return saveRegistration;
		}

	@PutMapping("/updateeducationdetails/{id}")
	@ApiOperation(value = "update education details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Education details updated successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public ResponseEntity<MessageResponse> updateById(@PathVariable Integer id,@RequestBody EducationRequest educationRequest) {
		logger.info("/updateById/{id}");
		ResponseEntity<MessageResponse> updateById = educationService.updateById(id, educationRequest);
		logger.info("/updateById/{id}");
		return updateById;
		}

	@DeleteMapping("/deleteeducationdetails/{id}")
	@ApiOperation(value = "Delete education details by id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Education details deleted successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public ResponseEntity<MessageResponse> deleteDeptById(@PathVariable Integer id,@RequestBody EducationRequest educationRequest) {
		logger.info("/deletebyid/{id}");
		ResponseEntity<MessageResponse> deleteById = educationService.deleteById(id, educationRequest);
		logger.info("/deletebyid/{id}");
		return deleteById;
		}

	@GetMapping("/getalleducationdetails")
	@ApiOperation(value = "Get all details", notes = "find details about all education", response = MessageResponse.class)
	public ResponseEntity<List<EducationResponse>> fetchdetails(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		logger.info("get api started");
		List<EducationResponse> retVal = new ArrayList<>();
		List<EducationResponse> teams = educationService.fetchdetails(page, limit);
		for (EducationResponse response : teams) {
			EducationResponse departmentmodel = new EducationResponse();
			BeanUtils.copyProperties(response, departmentmodel);
			retVal.add(departmentmodel);
		}
		logger.info("get api started");
		return new ResponseEntity<>(retVal,HttpStatus.OK);
	}


}
