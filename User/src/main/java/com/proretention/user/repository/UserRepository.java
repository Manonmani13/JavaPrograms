package com.proretention.user.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.proretention.user.entity.UserEntity;
import com.proretention.user.response.GetAllUserResponse;
import com.proretention.user.response.UserModelResponseModel;
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserEntity, Integer> 
{

	UserEntity getByUserId(int userId);

	Page<UserEntity> findAllByTenantKey(String tenantKey, Pageable pageable);

//	Page<UserModelResponseModel> findAllByTenantKey(String tenantKey, Pageable pageable);



}
