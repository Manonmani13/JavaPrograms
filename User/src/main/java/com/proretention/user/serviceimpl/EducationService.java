package com.proretention.user.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.user.entity.EducationModel;
import com.proretention.user.exception.ResourceNotFoundException;
import com.proretention.user.repository.EducationRepository;
import com.proretention.user.request.EducationRequest;
import com.proretention.user.response.EducationResponse;
import com.proretention.user.response.MessageResponse;
import com.proretention.user.service.ServiceMethod;

@Service
public class EducationService implements ServiceMethod
{
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private EducationResponse educationResponse;
	
	
	
	@Override
	public ResponseEntity<MessageResponse> fetchById(int id, EducationRequest educationRequest) {
		EducationModel educationModel = educationRepository.findById(id);
		if (educationModel == null) {
			return new ResponseEntity<MessageResponse>(new MessageResponse(251, "Id does not exists", null),
					HttpStatus.OK);
		} else {
			BeanUtils.copyProperties(educationModel, educationResponse);
			return new ResponseEntity<MessageResponse>(
					new MessageResponse(201, "Get detail by id successfully", educationResponse), HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<MessageResponse> saveRegistration(EducationRequest educationRequest) {
		checkFieldValidation(educationRequest);

		EducationModel educationModel = new EducationModel();
		if (educationModel.getCertificateName() == null) {
//			educationModel.setUserKey(educationRequest.getUserKey());
//			educationModel.setTenantKey(educationRequest.getTenantKey());
			educationModel.setCourse(educationRequest.getCourse());
			educationModel.setSpecialization(educationRequest.getSpecialization());
			educationModel.setInstitution(educationRequest.getInstitution());
			educationModel.setDuration(educationRequest.getDuration());
			educationModel.setYearOfPassing(educationRequest.getYearOfPassing());
			educationModel.setPercentage(educationRequest.getPercentage());
			educationModel.setCertificateName(educationRequest.getCertificateName());
			educationModel.setFilePath(educationRequest.getFilePath());

			educationRepository.save(educationModel);
			
			educationResponse.setCertId(educationModel.getCertId());
			educationResponse.setCreatedDate(educationModel.getCreatedDate());
			educationResponse.setUpdateDate(educationModel.getUpdateDate());

			return new ResponseEntity<MessageResponse>(
					new MessageResponse(201, "Details saved successfully", educationResponse), HttpStatus.OK);
		} else {

			return new ResponseEntity<MessageResponse>(
					new MessageResponse(202, "Details not saved successfully", educationResponse), HttpStatus.OK);
		}

	}
	
	@Override
	public ResponseEntity<MessageResponse> updateById(int id, EducationRequest educationRequest) {
		checkFieldValidation(educationRequest);
		EducationModel educationModel = educationRepository.findById(id);

		if(educationModel==null)
		{	
			return new ResponseEntity<MessageResponse>(new MessageResponse(251, "Id does not exists", null),
					HttpStatus.OK);
		}else {
//			educationModel.setUserKey(educationRequest.getUserKey());
//			educationModel.setTenantKey(educationRequest.getTenantKey());
			educationModel.setCourse(educationRequest.getCourse());
			educationModel.setSpecialization(educationRequest.getSpecialization());
			educationModel.setInstitution(educationRequest.getInstitution());
			educationModel.setDuration(educationRequest.getDuration());
			educationModel.setYearOfPassing(educationRequest.getYearOfPassing());
			educationModel.setPercentage(educationRequest.getPercentage());
			educationModel.setCertificateName(educationRequest.getCertificateName());
			educationModel.setFilePath(educationRequest.getFilePath());

			educationRepository.save(educationModel);
			
			educationResponse.setCertId(educationModel.getCertId());
			educationResponse.setCreatedDate(educationModel.getCreatedDate());
			educationResponse.setUpdateDate(educationModel.getUpdateDate());

		return new ResponseEntity<MessageResponse>(
				new MessageResponse(202, "Details updated successfully", educationResponse), HttpStatus.OK);
	}
}

	@Override
	public ResponseEntity<MessageResponse> deleteById(int id, EducationRequest educationrequest) {

		
		EducationModel educationModel = educationRepository.findById(id);
		if(educationModel==null) {
			return new ResponseEntity<MessageResponse>(new MessageResponse(251, "Id does not exists", null),
					HttpStatus.OK);
		} else {
			educationRepository.delete(educationModel);
			return new ResponseEntity<MessageResponse>(new MessageResponse(202, "Deleted successfully", educationResponse),
					HttpStatus.OK);

		}
	}


	
	@Override
	public List<EducationResponse> fetchdetails(int page, int limit) {

		List<EducationResponse> retVal = new ArrayList<>();

		if (page > 0) {
			page = page - 1;
		}
        

		Pageable pageableRequest = PageRequest.of(page, limit);

		Page<EducationModel> usersPage = educationRepository.findAll(pageableRequest);
		
		List<EducationModel> users = usersPage.getContent();

		for (EducationModel userEntity : users) {
			EducationResponse response = new EducationResponse();
			BeanUtils.copyProperties(userEntity, response);
			retVal.add(response);
		}
		return retVal;
	}

	
	public ResponseEntity<MessageResponse> checkFieldValidation(EducationRequest educationRequest) {
		System.out.println("In validation : ");

		String userKey = educationRequest.getUserKey();
		String tenantkey = educationRequest.getTenantKey();
		String course = educationRequest.getCourse();
		String specialization = educationRequest.getSpecialization();
		String institution = educationRequest.getInstitution();
		String duration = educationRequest.getDuration();
		String certificateName = educationRequest.getCertificateName();
		String filePath = educationRequest.getFilePath();


		if ((userKey.isEmpty()) || (userKey.trim().length() < 3) || (userKey.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid department");
		} else if ((tenantkey.isEmpty()) || (tenantkey.trim().length() < 3)
				|| (tenantkey.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid departmentHead");
		} else if ((course.isEmpty()) || (course.trim().length() < 3) || (course.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid location");
		} else if ((specialization.isEmpty()) || (specialization.trim().length() < 3)
				|| (specialization.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		} 
		else if ((institution.isEmpty()) || (institution.trim().length() < 3)
				|| (institution.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		}else if ((duration.isEmpty()) || (duration.trim().length() < 3)
				|| (duration.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		}else if ((specialization.isEmpty()) || (specialization.trim().length() < 3)
				|| (specialization.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		}else if ((certificateName.isEmpty()) || (certificateName.trim().length() < 3)
				|| (certificateName.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		}else if ((filePath.isEmpty()) || (filePath.trim().length() < 3)
				|| (filePath.trim().length() > 100)) {
			throw new ResourceNotFoundException("Please enter valid description");
		}else
			return new ResponseEntity<MessageResponse>(new MessageResponse(253, "", null), HttpStatus.OK);
	}




}
