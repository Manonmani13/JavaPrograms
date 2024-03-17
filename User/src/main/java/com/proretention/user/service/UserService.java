package com.proretention.user.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.proretention.user.entity.UserEntity;
import com.proretention.user.request.UserRequest;
import com.proretention.user.response.GetAllUserResponse;
import com.proretention.user.response.GetUserResponse;
import com.proretention.user.response.UserMessageResponse;
import com.proretention.user.response.UserResponse;

@Service
public interface UserService {

	ResponseEntity<UserMessageResponse> saveUser(UserRequest request);

	ResponseEntity<GetUserResponse> getByUserId(int userId);

	ResponseEntity<UserMessageResponse> deleteUserByUserId(int userId);

	ResponseEntity<UserMessageResponse> updateUser(int userId, UserRequest request);

	List<UserResponse> getUsers(int page, int limit);

	ResponseEntity<GetAllUserResponse> findAllUsersByTenantKey(String tenantKey, Pageable pageable);

	

	//GetAllUserResponse findAllUsersByTenantKey(String tenantKey, Pageable pageable);

}
