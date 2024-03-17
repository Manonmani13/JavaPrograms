package com.proretention.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.proretention.user.request.EducationRequest;
import com.proretention.user.response.EducationResponse;
import com.proretention.user.response.MessageResponse;


public interface ServiceMethod 
{
ResponseEntity<MessageResponse> saveRegistration(EducationRequest educationrequest);
	
	ResponseEntity<MessageResponse> updateById(int id, EducationRequest educationrequest);

	ResponseEntity<MessageResponse> deleteById(int id, EducationRequest educationrequest);

	ResponseEntity<MessageResponse> fetchById(int id, EducationRequest educationrequest);

	List<EducationResponse> fetchdetails(int page, int limit);


}
