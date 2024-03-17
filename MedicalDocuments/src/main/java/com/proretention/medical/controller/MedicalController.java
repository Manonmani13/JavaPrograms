package com.proretention.medical.controller;

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
import com.proretention.medical.request.MedicalRequest;
import com.proretention.medical.response.MedicalResponse;
import com.proretention.medical.service.MedicalService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("api/medical")
public class MedicalController {
	Logger logger = LogManager.getLogger(MedicalController.class);

	@Autowired
	public MedicalService medicalService;
	@PostMapping("/createmedical")
	@ApiOperation(value = "this method is used to save medical details", 
	notes = "give details about your medical details to save", 
	response = MessageResponse.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Medical details created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), 
			@ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public ResponseEntity<MessageResponse> saveMedicalDetails(@RequestBody MedicalRequest medical)
	{
		logger.info("MedicalDetail saveMedicalDetails started");
		return medicalService.saveMedicalDetails(medical);
	}
	
	@GetMapping("/getMedicalDetailsById/{id}")
	@ApiOperation(value = "this method is used to find medical details by Id",
	notes = "find details about your medicalDetails by Id", 
	response = GetMedicalResponses.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "MedicalDetails get successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })

	public ResponseEntity<GetMedicalResponses> getMedicalDetailsById(@PathVariable("id") int documentId)
	{
		logger.info("MedicalDetails getMedicalDetailsById started");
		return medicalService.getMedicalDetailsById(documentId);
	}
	
	@GetMapping("/getall")
	@ApiOperation(value = "this method is used to find all medical details", 
	notes = "find details about  all medical details ", response = MedicalResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "GetAll Details successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public ResponseEntity<List<MedicalResponse>> getAllMedicalDetails(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit)
	{
		logger.info("MedicalDetails getAllMedicalDetails started");
		List<MedicalResponse> medRes=new ArrayList<>();
		List<MedicalResponse> medResponse=medicalService.getAllMedicalDetails(page,limit);
		for (MedicalResponse medicalRe : medResponse) {
			MedicalResponse medicalDetails = new MedicalResponse();
			BeanUtils.copyProperties(medicalRe, medicalDetails);
			medRes.add(medicalDetails);
		}
		logger.info("MedicalDetails getAllMedicalDetails completed");
		return new ResponseEntity<>(medRes, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	@ApiOperation(value = "this method is used to update medical details", 
	notes = "give documentId  to update your medical details ", response = MessageResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "MedicalDetails updated successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })

	public ResponseEntity<MessageResponse> updateDocumentById(@PathVariable("id") int documentId,
			@RequestBody MedicalResponse medical) {
		logger.info("MedicalDetails updateDocumentById started");
	return medicalService.updateDocumentById(documentId,medical);
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "this method is used to delete medical details", 
	notes = "give you documentId  to delete your details", response = OperationStatusModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Organization Deteled successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	
	public OperationStatusModel deleteByDocumentId(@PathVariable("id")int documentId)
	{
		logger.info("MedicalDetails deleteByDocumentId started");
		OperationStatusModel operation=new OperationStatusModel();
		operation.setOperationName(RequestOperationName.DELETE.name());
		medicalService.deleteByDocumentId(documentId);
		operation.setOperationResult(RequestOperationStatus.Success.name());
		logger.info("MedicalDetails deleteByDocumentId completed");
		return operation;
		
	}
	
}