package com.proretention.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proretention.medical.entity.MedicalDetails;

@Repository
public interface MedicalRepository extends JpaRepository<MedicalDetails,Integer>{



	MedicalDetails findByDocumentId(int documentId);

}
