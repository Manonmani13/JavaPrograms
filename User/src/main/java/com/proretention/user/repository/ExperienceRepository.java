package com.proretention.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proretention.user.entity.Experience;



public interface ExperienceRepository extends JpaRepository<Experience , Integer>{
	
	Experience findByExpId(int expId);
}
 