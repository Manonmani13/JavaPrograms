package com.proretention.medical.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.medical.controller.GetMedicalResponses;
import com.proretention.medical.controller.MedicalController;
import com.proretention.medical.controller.MedicalResponses;
import com.proretention.medical.controller.MessageResponse;
import com.proretention.medical.entity.MedicalDetails;
import com.proretention.medical.exception.ResourceNotFound;
import com.proretention.medical.repository.MedicalRepository;
import com.proretention.medical.request.MedicalRequest;
import com.proretention.medical.response.MedicalResponse;
import com.proretention.medical.service.MedicalService;

@Service
public class MedicalServiceImp implements MedicalService {
	Logger logger = LogManager.getLogger(MedicalController.class);
	@Autowired
	public MedicalRepository medicalRepository;
	@Autowired
	MedicalResponses medicalResponse;

	@Override
	public ResponseEntity<MessageResponse> saveMedicalDetails(MedicalRequest medical) {
		try {

			if (medical.getDocumentPath().isEmpty() || medical.getTenantKey().isEmpty() || medical.getTitle().isEmpty()
					|| medical.getUserKey().isEmpty())

				throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (ResourceNotFound rs) {
			throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (Exception e) {
			throw new ResourceNotFound("some thing wrong in service");
		}
		MedicalDetails medicalDet = new MedicalDetails();
		medicalDet.setTenantKey(medical.getTenantKey());
		medicalDet.setTitle(medical.getTitle());
		medicalDet.setUserKey(medical.getUserKey());
		medicalDet.setDocumentPath(medical.getDocumentPath());
		MedicalDetails medicalDetails = medicalRepository.save(medicalDet);
		medicalResponse.setData(medicalDetails.getDocumentId());
		logger.info("MedicalDetail saveMedicalDetails completed");
		return new ResponseEntity<MessageResponse>(
				new MessageResponse(201, "Details saved successfully", 
						medicalResponse), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<GetMedicalResponses> getMedicalDetailsById(int documentId) {
		try {
		MedicalDetails medical = medicalRepository.findByDocumentId(documentId);
		MedicalResponse medicalRes = new MedicalResponse();
		BeanUtils.copyProperties(medical, medicalRes);
		logger.info("MedicalDetail getMedicalDetailsById completed");
		return new ResponseEntity<GetMedicalResponses>(
				new GetMedicalResponses(201, "Details saved successfully", medicalRes), HttpStatus.OK);
		}
	catch (java.util.NoSuchElementException e) {
		throw new ResourceNotFound("given  id doesnot exist in DB");

	} 
	catch (IllegalArgumentException e) {
		throw new ResourceNotFound("given  documentId  not exist");
	}
	catch (Exception e) {
		throw new ResourceNotFound("something  went wrong  in service layer");
	}
	}

	@Override
	public List<MedicalResponse> getAllMedicalDetails(int page, int limit) {

		List<MedicalResponse> medResponse = new ArrayList<>();
		

		if (page > 0) {
			page = page - 1;
		}
		PageRequest pageableRequest = PageRequest.of(page, limit);

		Page<MedicalDetails> medPage = medicalRepository.findAll(pageableRequest);
		List<MedicalDetails> medicalDet = medPage.getContent();
		try
		{
			if (medPage.isEmpty())
				throw new ResourceNotFound("there is no data found");

		} 
		
		catch (ResourceNotFound e)
		{
			throw new ResourceNotFound("there is no data found");
		} 
		
		catch (Exception e) 
		{
			throw new ResourceNotFound("Something went wrong in Service layer ");
		}

		for (MedicalDetails medical : medicalDet) {
			MedicalResponse medRes = new MedicalResponse();
			BeanUtils.copyProperties(medical, medRes);
			medResponse.add(medRes);
		}
		logger.info("MedicalDetail getAllMedicalDetails completed");
		return medResponse;
	}

	@Override
	public ResponseEntity<MessageResponse> updateDocumentById(int documentId, MedicalResponse medical) {
		try {

			if (medical.getDocumentPath().isEmpty() || medical.getTenantKey().isEmpty() || medical.getTitle().isEmpty()
					|| medical.getUserKey().isEmpty())

				throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (ResourceNotFound rs) {
			throw new ResourceNotFound("please give proper input because there is some filed null");
		} catch (Exception e) {
			throw new ResourceNotFound("some thing wrong in service");
		}
		MedicalDetails medicalDet = medicalRepository.findByDocumentId(documentId);
		try {
			if (medicalDet == null)
				throw new ResourceNotFound("plese give correct id");
		}
		catch (java.util.NoSuchElementException e) {
			throw new ResourceNotFound("given  id doesnot exist in DB");

		}
		catch (IllegalArgumentException e) {
			throw new ResourceNotFound("given  id is not exist, please send some id to be searched");
		}
		catch (Exception e) {
			throw new ResourceNotFound("Something went wrong in Service layer while fetching all employees");
		}
		medicalDet.setDocumentPath(medical.getDocumentPath());
		medicalDet.setTenantKey(medical.getTenantKey());
		medicalDet.setTitle(medical.getTitle());
		medicalDet.setUserKey(medical.getUserKey());
		medicalRepository.save(medicalDet);
		medicalResponse.setData(medicalDet.getDocumentId());
		logger.info("MedicalDetail updateDocumentById completed");
		return new ResponseEntity<MessageResponse>(
				new MessageResponse(201, "Details saved successfully", medicalResponse), HttpStatus.OK);

	}

	@Override
	public void deleteByDocumentId(int documentId) {

		MedicalDetails medical = medicalRepository.findByDocumentId(documentId);
		try {
			if (medical == null)
				throw new IllegalArgumentException("DocumentId is null");
		} 
		catch (IllegalArgumentException e) {
			throw new ResourceNotFound("give documentId is doesnt exist in db");
		}
		catch (Exception e) {
			throw new ResourceNotFound("Something  went wrong  in service layer");
		}
		
		medicalRepository.delete(medical);
		logger.info("MedicalDetail deleteByDocumentId completed");
	}

}
