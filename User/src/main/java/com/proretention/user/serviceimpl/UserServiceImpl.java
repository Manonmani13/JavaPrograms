package com.proretention.user.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.user.controller.UserController;
import com.proretention.user.entity.UserEntity;
import com.proretention.user.exception.ResourceNotFoundException;
import com.proretention.user.repository.UserRepository;
import com.proretention.user.request.UserRequest;
import com.proretention.user.response.GetAllUserResponse;
import com.proretention.user.response.GetUserResponse;
import com.proretention.user.response.UserIdResponse;
import com.proretention.user.response.UserMessageResponse;
import com.proretention.user.response.UserModelResponseModel;
import com.proretention.user.response.UserResponse;
import com.proretention.user.service.UserService;

@Service
public class UserServiceImpl implements UserService 

{
	Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public UserIdResponse userIdResponse;
	@Override
	public ResponseEntity<UserMessageResponse> saveUser(UserRequest request)
	{
		try
		{
	 if(request.getUserKey().isEmpty()||request.getTenantKey().isEmpty()||request.getFirstName().isEmpty()
			 ||request.getLastName().isEmpty()||request.getEmailPersonal().isEmpty()||request.getDateOfBirth().isEmpty()
			 ||request.getFatherName().isEmpty()||request.getMotherName().isEmpty()||request.getAddress().isEmpty()
			 ||request.getPhone().isEmpty()||request.getDesignation().isEmpty()||request.getReportingManager().isEmpty()
			 ||request.getEmailOfficial().isEmpty()||request.getEmployeeId().isEmpty()||request.getBranch().isEmpty()
			 ||request.getDateOfJoining().isEmpty()||request.getOverAllExperience().isEmpty()||request.getEmployeeRole().isEmpty()
			 ||request.getAnySurgery().isEmpty()||request.getSurgeryDetails().isEmpty()||request.getIsFirstAidRequired().isEmpty()
			 ||request.getFirstAidDetails().isEmpty())
		 throw new ResourceNotFoundException("please give proper input");
		}
		catch (ResourceNotFoundException e)
		{
			throw new ResourceNotFoundException("please give proper input,please fill all the fields");
		}
		
		
		catch (Exception e) 
		{
			throw new ResourceNotFoundException("some thing wrong in service");
		}
		UserEntity entity =new UserEntity();
		BeanUtils.copyProperties(request, entity);
		UserEntity entity1=userRepository.save(entity);
		userIdResponse.setData(entity1.getUserId());
		logger.info("createTeam api completed");
		return new ResponseEntity<UserMessageResponse>(
				new UserMessageResponse(201, "user created successfully", userIdResponse), HttpStatus.OK);
		
		 
		
	}
	@Override
	public ResponseEntity<GetUserResponse> getByUserId(int userId)
	{
		
		try 
		{
		UserEntity entity =userRepository.getByUserId(userId);
		UserResponse response =new UserResponse();
		BeanUtils.copyProperties(entity, response);
		 logger.info("get user api completed");
		return new ResponseEntity<GetUserResponse>(
				new GetUserResponse(201, "Get user details successfully ", response), HttpStatus.OK);
		
  	   }
		catch (java.util.NoSuchElementException e) 
		{
			throw new ResourceNotFoundException("given  id doesnot exist in DB");

		} 
		
		catch (IllegalArgumentException e)
		{
			throw new ResourceNotFoundException("given  id is not exist, please send some id to be searched");
		} 
		
		catch (Exception e) 
		{
			throw new ResourceNotFoundException("Something went wrong in Service layer while fetching all employees");
		}
	}
	@Override
	public ResponseEntity<UserMessageResponse> deleteUserByUserId(int userId) 
	{
		UserEntity entity =userRepository.getByUserId(userId);
		
		
		try
		{
			
			if (entity == null)
				throw new ResourceNotFoundException("please give proper input");

		} 
		
		catch (ResourceNotFoundException e)
		{
			throw new ResourceNotFoundException("given  id is not exist, please send some id to be searched");
		} 
		
		catch (Exception e) 
		{
			throw new ResourceNotFoundException("Something went wrong in Service layer while fetching all employees");
		}
		userIdResponse.setData(entity.getUserId());
		userRepository.delete(entity);
		return new ResponseEntity<UserMessageResponse>(
				new UserMessageResponse(201, "user deleted successfully", userIdResponse), HttpStatus.OK);
		
	}
	@Override
	public ResponseEntity<UserMessageResponse> updateUser(int userId, UserRequest request) {
	
	
		try {
			 if(request.getUserKey().isEmpty()||request.getTenantKey().isEmpty()||request.getFirstName().isEmpty()
					 ||request.getLastName().isEmpty()||request.getEmailPersonal().isEmpty()||request.getDateOfBirth().isEmpty()
					 ||request.getFatherName().isEmpty()||request.getMotherName().isEmpty()||request.getAddress().isEmpty()
					 ||request.getPhone().isEmpty()||request.getDesignation().isEmpty()||request.getReportingManager().isEmpty()
					 ||request.getEmailOfficial().isEmpty()||request.getEmployeeId().isEmpty()||request.getBranch().isEmpty()
					 ||request.getDateOfJoining().isEmpty()||request.getOverAllExperience().isEmpty()||request.getEmployeeRole().isEmpty()
					 ||request.getAnySurgery().isEmpty()||request.getSurgeryDetails().isEmpty()||request.getIsFirstAidRequired().isEmpty()
					 ||request.getFirstAidDetails().isEmpty())
				 throw new ResourceNotFoundException("please give proper input");
				}
				catch (ResourceNotFoundException e)
				{
					throw new ResourceNotFoundException("please give proper input,please fill all the fields");
				}
				
				catch (Exception e) 
				{
					throw new ResourceNotFoundException("some thing wrong in service");
				}

		UserEntity entity =userRepository.getByUserId(userId);
		try
		{
			if (entity == null)
				throw new ResourceNotFoundException("please give proper input");

		} 
		
		catch (ResourceNotFoundException e)
		{
			throw new ResourceNotFoundException("given  id is not exist, please send some id to be searched");
		} 
		
		catch (Exception e) 
		{
			throw new ResourceNotFoundException("Something went wrong in Service layer while fetching all employees");
		}
		entity.setUserKey(request.getUserKey());
		entity.setTenantKey(request.getTenantKey());
		entity.setFirstName(request.getFirstName());
		entity.setLastName(request.getLastName());
		entity.setEmailPersonal(request.getEmailPersonal());
		entity.setDateOfBirth(request.getDateOfBirth());
		entity.setFatherName(request.getFatherName());
		entity.setMotherName(request.getMotherName());
		entity.setAddress(request.getAddress());
		entity.setPhone(request.getPhone());
		entity.setDesignation(request.getDesignation());
		entity.setReportingManager(request.getReportingManager());
		entity.setEmailOfficial(request.getEmailOfficial());
		entity.setEmployeeId(request.getEmployeeId());
		entity.setBranch(request.getBranch());
		entity.setDateOfJoining(request.getDateOfJoining());
		entity.setOverAllExperience(request.getOverAllExperience());
		entity.setEmployeeRole(request.getEmployeeRole());
		entity.setAnySurgery(request.getAnySurgery());
		entity.setSurgeryDetails(request.getSurgeryDetails());
		entity.setIsFirstAidRequired(request.getIsFirstAidRequired());
		entity.setFirstAidDetails(request.getFirstAidDetails());
		userRepository.save(entity);
		userIdResponse.setData(entity.getUserId());
		 logger.info("update user api completed");
		return new ResponseEntity<UserMessageResponse>(
				new UserMessageResponse(201, "userDetails Updated Successfully", userIdResponse), HttpStatus.OK);

		
	}
	@Override
	public List<UserResponse> getUsers(int page, int limit) {
		
		List<UserResponse> retVal = new ArrayList<>();

		if (page > 0)
		{
			page = page - 1;
		}

		Pageable pageableRequest = PageRequest.of(page, limit);

		Page<UserEntity> usersPage = userRepository.findAll(pageableRequest);

		try
		{
			if (usersPage.isEmpty())
				throw new ResourceNotFoundException("there is no data found");

		} 
		
		catch (ResourceNotFoundException e)
		{
			throw new ResourceNotFoundException("there is no data found");
		} 
		
		catch (Exception e) 
		{
			throw new ResourceNotFoundException("Something went wrong in Service layer while fetching all employees");
		}

		List<UserEntity> users = usersPage.getContent();

		for (UserEntity userEntity : users) 
		{
			UserResponse response = new UserResponse();
			BeanUtils.copyProperties(userEntity, response);
			retVal.add(response);
		}
		return retVal;
	}
	/*
	 * @Override public GetAllUserResponse findAllUsersByTenantKey(String tenantKey,
	 * Pageable pageable) { //Page<UserModelResponseModel> studs=
	 * userRepository.findAllByTenantKey(tenantKey,pageable); 
	 * Page<UserEntity> entity=userRepository.findAllByTenantKey(tenantKey,pageable);
	 *  
	 * 
	 * GetAllUserResponse response =new GetAllUserResponse(); 
	 * List<UserEntity> uentity=entity.getContent();
	 *  List<UserModelResponseModel> responseModel=new ArrayList<>();
	 * 
	 * 
	 * for(UserEntity ue:uentity) 
	 * { 
	 * UserModelResponseModel model =new
	 * UserModelResponseModel();
	 * 
	 * UserEntity userentityy=ue; model.setUserId(userentityy.getUserId());
	 * model.setName(userentityy.getFirstName()+" "+userentityy.getLastName());
	 * model.setDesignation(userentityy.getDesignation());
	 * model.setEmailId(userentityy.getEmailOfficial());
	 * model.setStatus(userentityy.getStatus()); responseModel.add(model);
	 * 
	 * }
	 * 
	 * response.setCurrentpage(entity.getNumber());
	 * response.setTotalcount(entity.getTotalElements());
	 * response.setTotalpages(entity.getTotalPages());
	 * response.setEntity(responseModel); //UserModelResponseModel model =new
	 * UserModelResponseModel();
	 * 
	 * // // Page<UserModelResponseModel> model =(Page<UserModelResponseModel>) new
	 * UserModelResponseModel(); // BeanUtils.copyProperties(entity, model);
	 * 
	 * 
	 * // return GetAllUserResponse // .builder() //
	 * .totalcount(studs.getTotalElements()) // .totalpages(studs.getTotalPages())
	 * // .currentpage(studs.getNumber()) // .response(studs.getContent()) //
	 * .build(); return response; }
	 */
	@Override
	public ResponseEntity<GetAllUserResponse> findAllUsersByTenantKey(String tenantKey, Pageable pageable) {
		GetAllUserResponse response =new GetAllUserResponse();
		Page<UserEntity> entity=userRepository.findAllByTenantKey(tenantKey,pageable);
		
		List<UserEntity> uentity=entity.getContent();
		 List<UserModelResponseModel> responseModel=new ArrayList<>();
		 for(UserEntity ue:uentity) 
			 { 
			  UserModelResponseModel model =new
			  UserModelResponseModel();
			  
			  UserEntity userentityy=ue; model.setUserId(userentityy.getUserId());
			  model.setName(userentityy.getFirstName()+" "+userentityy.getLastName());
			  model.setDesignation(userentityy.getDesignation());
			  model.setEmailId(userentityy.getEmailOfficial());
			  model.setStatus(userentityy.getStatus()); responseModel.add(model);
			  
			  }
		 response.setCurrentpage(entity.getNumber());
		  response.setTotalcount(entity.getTotalElements());
		  response.setTotalpages(entity.getTotalPages());
		  response.setEntity(responseModel); 
		 
		return new ResponseEntity<GetAllUserResponse>(
				new GetAllUserResponse(responseModel, entity.getTotalElements(),entity.getTotalPages(),entity.getNumber()), HttpStatus.OK);
	}


}