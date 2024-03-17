package com.proretention.user.service;


import org.springframework.http.ResponseEntity;

import com.proretention.user.request.ExperienceRequest;
import com.proretention.user.response.ExpMessageResponse;
import com.proretention.user.response.ExpMessresp;
import com.proretention.user.response.ExpeMessageResponse;

public interface ExperienceService{
	
	ResponseEntity<ExpMessageResponse> createMethod(ExperienceRequest req) ;
	
	 
	 
	 ResponseEntity<ExpMessresp> getAllDetails(int page , int limit);
	 ResponseEntity<ExpeMessageResponse> getById(int id ) ;
	 
	 ResponseEntity<ExpMessageResponse> updateByExpId(int Id , ExperienceRequest ref) ;
	 
	 ResponseEntity<ExpMessageResponse> deleteById(int Id) ;
}