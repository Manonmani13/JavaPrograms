package com.proretention.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.proretention.user.entity.EducationModel;
@Component
public interface EducationRepository extends JpaRepository<EducationModel, Integer>  
{
	EducationModel findById(int certId);


}
