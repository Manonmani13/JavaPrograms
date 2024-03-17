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

import com.proretention.user.entity.Experience;
import com.proretention.user.exception.ResourceNotFoundException;
import com.proretention.user.repository.ExperienceRepository;
import com.proretention.user.request.ExperienceRequest;
import com.proretention.user.request.GetResponse;
import com.proretention.user.response.ExpMessageResponse;
import com.proretention.user.response.ExpMessresp;
import com.proretention.user.response.ExpeMessageResponse;
import com.proretention.user.response.ResponseModel;
import com.proretention.user.service.ExperienceService;



@Service
public class ExperienceServiceImplementation implements ExperienceService
{
	
	
	@Autowired
	ExperienceRepository repository;
	
	@Autowired
	ResponseModel resp;
	
	
	//post method
	@Override
	public ResponseEntity<ExpMessageResponse> createMethod(ExperienceRequest req) {
	
		try {
			if(req.getUserKey().isEmpty() || req.getTenantKey().isEmpty()|| req.getOrganisationName().isEmpty()||
			req.getDesignation().isEmpty()||req.getDateOfJoining().isEmpty()|| req.getLastWorkingDate().isEmpty() || req.getExperience().isEmpty())
				throw new ResourceNotFoundException("please give proper input");	
			}
		 catch (ResourceNotFoundException e) {
				throw new ResourceNotFoundException("please give proper input");
			} catch (Exception e) {
				throw new ResourceNotFoundException("some thing wrong in service");
			}
      
            ResponseModel resp = new ResponseModel();
		   Experience entity = new Experience();
		    BeanUtils.copyProperties(req,entity);
		    repository.save(entity);
		    BeanUtils.copyProperties(entity,resp);
		    resp.setExp_id(entity.getExpId());
		    return new ResponseEntity<ExpMessageResponse>(new ExpMessageResponse(201, "Details saved successfully", resp), HttpStatus.OK);
}

	
	//Get All
    @Override
	public ResponseEntity<ExpMessresp> getAllDetails(int page , int limit){
    	List<Experience> dto = new ArrayList<>();
    	
    	if(page>0) {
    		page = page-1;
    	}
	
    	Pageable pageableRequest = PageRequest.of(page, limit);
    	Page<Experience> usersPage = repository.findAll(pageableRequest);
    	List<Experience> users = usersPage.getContent();
    	
    	for(Experience Entity : users) {
    		Experience userDto = new Experience();
    		BeanUtils.copyProperties(Entity, userDto);
    		dto.add(userDto);
    	}
    	try {
       if(dto.isEmpty())
    	   throw new ResourceNotFoundException("No Data available in DB");	
	}
     catch (ResourceNotFoundException e) {
		throw new ResourceNotFoundException("No Content");
	} catch (Exception e) {
		throw new ResourceNotFoundException("some thing wrong in service");
	}
    	return new ResponseEntity<ExpMessresp>(new ExpMessresp(202 , "Fetched Successfully" , dto.size(),dto),HttpStatus.OK);
    }
	
	//get by id
    @Override
	public ResponseEntity<ExpeMessageResponse> getById(int id ) {
				try 
				{
					Experience entity = repository.findByExpId(id);
				if(entity==null) {
				return new ResponseEntity<ExpeMessageResponse>(new ExpeMessageResponse(251, "Id doesn't Exist in db", null),HttpStatus.NOT_FOUND);
				}
				else {
					GetResponse ob = new GetResponse();
					BeanUtils.copyProperties(entity, ob);
					return new ResponseEntity<ExpeMessageResponse>(new ExpeMessageResponse(202, "Fetched Successfully",ob), HttpStatus.OK);	
				}
			}		
				catch (java.util.NoSuchElementException e) {
					throw new ResourceNotFoundException("given  id doesnot exist in DB" );
		
				} catch (IllegalArgumentException e) {
					throw new ResourceNotFoundException(
							"given  id is not exist, please send some id to be searched" );
				} catch (Exception e) {
					throw new ResourceNotFoundException(
							"Something went wrong in Service layer while fetching all employees" );
				}
			}

	//update
    @Override
	public ResponseEntity<ExpMessageResponse> updateByExpId(int Id , ExperienceRequest ref) {
		
		
		Experience entity = repository.findByExpId(Id);
		
			if (entity == null) {
				return new ResponseEntity<ExpMessageResponse>(new ExpMessageResponse(251, "Id does not exists", null),
						HttpStatus.OK);
			}
			else
			{
					
//		entity.setUserKey(ref.getUserKey());
//		entity.setTenantKey(ref.getTenantKey());
		entity.setOrganisationName(ref.getOrganisationName());
		entity.setDesignation(ref.getDesignation());
		entity.setDateOfJoining(ref.getDateOfJoining());
		entity.setLastWorkingDate(ref.getLastWorkingDate());
		entity.setExperience(ref.getExperience());
		repository.save(entity);
		resp.setExp_id(Id);
		return new ResponseEntity<ExpMessageResponse>(
				new ExpMessageResponse(202, "Details updated successfully", resp), HttpStatus.OK);
	}
   }
	//delete
	@Override
	public ResponseEntity<ExpMessageResponse> deleteById(int Id) {
		
		Experience ref = repository.findByExpId(Id);
		try {
			if (ref == null)
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			throw new ResourceNotFoundException("given userKey doesnot exist in DB");
		} catch (Exception e) {
			throw new ResourceNotFoundException("Something went wrong in Service layer");
		}
		repository.delete(ref);
		resp.setExp_id(Id);
		return new ResponseEntity<ExpMessageResponse>(
				new ExpMessageResponse(202, "Deleted Successfully", resp), HttpStatus.OK);
	    }
	}

