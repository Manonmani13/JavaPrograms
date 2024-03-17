package com.proretention.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

import com.proretention.user.entity.UserEntity;
import com.proretention.user.request.UserRequest;
import com.proretention.user.response.GetAllUserResponse;
import com.proretention.user.response.GetUserResponse;
import com.proretention.user.response.OperationStatusModel;
import com.proretention.user.response.UserMessageResponse;
import com.proretention.user.response.UserResponse;
import com.proretention.user.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("api/user")
public class UserController 
{
	
	Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	public UserService userService;
	
	@PostMapping("/createuser")
	@ApiOperation(value = "this method is used for create user", notes = "provide details about user", response = UserMessageResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "user created successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public ResponseEntity<UserMessageResponse> createUser(@RequestBody UserRequest request)
	{
	   logger.info("create user api started");
		return userService.saveUser(request);
	}
	
	@GetMapping("/getuser/{id}")
	@ApiOperation(value = "this method is used for get is user details", notes = "provide an teamId to look up specific user", response = GetUserResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "userdetails read successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public ResponseEntity<GetUserResponse> getUser(@PathVariable("id") int userId)
	{
		 logger.info("get user api started");
		return userService.getByUserId(userId);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	@ApiOperation(value = "this method is used for delete user", notes = "provide team id which is you want to user", response = OperationStatusModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "user details deleted successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	public ResponseEntity<UserMessageResponse> deleteById(@PathVariable("id") int userId)
	{
		 logger.info("delete user api started");
		
		return userService.deleteUserByUserId(userId);
	}
	
	@ApiOperation(value = "this method is used for update userdetails", notes = "provide updated details about userdetails", response = UserMessageResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "user details updated successfully"),
			@ApiResponse(code = 401, message = "Unauthenticated access"),
			@ApiResponse(code = 403, message = "Access denied"), @ApiResponse(code = 404, message = "Not found!!!"),
			@ApiResponse(code = 500, message = "internal server error!!!"),
			@ApiResponse(code = 503, message = "Requested service unavailable!!!") })
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<UserMessageResponse> updateUser(@PathVariable("id") int userId,@RequestBody UserRequest request)
	{  logger.info("update user api started");
		 return userService.updateUser(userId,request);
	}
	
	
	@GetMapping("/getallusers")
	@ApiOperation(value = "this method is used for get all user details", notes = "find details about all user", response = UserResponse.class)
	public ResponseEntity<List<UserResponse>> getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit)
	{
		 logger.info("getall user api started");
		List<UserResponse> retVal = new ArrayList<>();
		List<UserResponse> users = userService.getUsers(page, limit);

		for (UserResponse response : users) 
		{
			UserResponse userModel = new UserResponse();
			BeanUtils.copyProperties(response, userModel);
			retVal.add(userModel);
		}
		 logger.info("getall user api completed");
		return new ResponseEntity<>(retVal,HttpStatus.OK);
	}
	
//	@GetMapping("getallUsers/{tenantkey}")
//	public  GetAllUserResponse getAllUserByTenantKey(@PathVariable("tenantkey") String tenantKey,Pageable pageable)
//	{
//		logger.info("getall user by tenant key api started");
//	//	ResponseEntity<GetAllUserResponse> response =userService.getAllUsersByTenantKey(tenantKey,pageable);
//		return userService.findAllUsersByTenantKey(tenantKey,pageable);
//				
//		
//	}
	@GetMapping("getallUsers/{tenantkey}")
	public    ResponseEntity<GetAllUserResponse>  getAllUserByTenantKey(@PathVariable("tenantkey") String tenantKey,Pageable pageable)
	{
		logger.info("getall user by tenant key api started");
	//	ResponseEntity<GetAllUserResponse> response =userService.getAllUsersByTenantKey(tenantKey,pageable);
		return userService.findAllUsersByTenantKey(tenantKey,pageable);
				
		
	}

}
