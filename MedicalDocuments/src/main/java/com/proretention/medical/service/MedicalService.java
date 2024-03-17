package com.proretention.medical.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.medical.controller.GetMedicalResponses;
import com.proretention.medical.controller.MessageResponse;
import com.proretention.medical.request.MedicalRequest;
import com.proretention.medical.response.MedicalResponse;
@Service
public interface MedicalService {

	ResponseEntity<MessageResponse> saveMedicalDetails(MedicalRequest medical);

	ResponseEntity<GetMedicalResponses> getMedicalDetailsById(int documentId);

	List<MedicalResponse> getAllMedicalDetails(int page, int limit);

	ResponseEntity<MessageResponse> updateDocumentById(int documentId, MedicalResponse medical);

	void deleteByDocumentId(int documentId);

}
