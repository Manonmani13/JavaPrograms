package com.proretention.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.user.request.MedicalRequest;
import com.proretention.user.response.GetMedicalResponses;
import com.proretention.user.response.MedicalMessageResponse;
import com.proretention.user.response.MedicalResponse;
import com.proretention.user.response.MessageResponseDel;

@Service
public interface MedicalService {

	ResponseEntity<MedicalMessageResponse> saveMedicalDetails(MedicalRequest medical);

	ResponseEntity<GetMedicalResponses> getMedicalDetailsById(int documentId);

	List<MedicalResponse> getAllMedicalDetails(int page, int limit);

	ResponseEntity<MedicalMessageResponse> updateDocumentById(int documentId, MedicalResponse medical);

	ResponseEntity<MessageResponseDel> deleteByDocumentId(int documentId);

}
