package com.proretention.medical;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.proretention.medical.entity.MedicalDetails;
import com.proretention.medical.repository.MedicalRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MedicalRepositoryTest {
@Autowired
MedicalRepository medicalRepsitory;
@Test
@Order(1)
@Rollback(value = false)
public void saveMedcialDetails() {
	MedicalDetails medical = MedicalDetails.builder()
			.documentPath("welcome/mydocument")
			.tenantKey("t1")
			.title("java")
			.userKey("user1")
			.documentId(1)
			.build();
	medicalRepsitory.save(medical);
	Assertions.assertThat(medical.getDocumentId()).isGreaterThan(0);
}

@Test
@Order(2)
public void getMedcialDetails() {
	MedicalDetails med = medicalRepsitory.findByDocumentId(1);
	Assertions.assertThat(med.getDocumentId()).isEqualTo(1);
}

@Test
@Order(3)
public void getListOfMedicalDetails() {
	List<MedicalDetails> medical = medicalRepsitory.findAll();
	Assertions.assertThat(medical.size()).isGreaterThan(0);
}

@Test
@Order(4)
@Rollback(value = false)
public void updateMedicalDetails() {
	MedicalDetails med = medicalRepsitory.findByDocumentId(1);
	med.setTitle("c++");
	med.setDocumentPath("/mydoc");
	med.setTenantKey("t11");
	med.setUserKey("user1");
	MedicalDetails medupdate = medicalRepsitory.save(med);
	Assertions.assertThat(medupdate.getTitle()).isEqualTo("c++");
	Assertions.assertThat(medupdate.getDocumentPath()).isEqualTo("/mydoc");
	Assertions.assertThat(medupdate.getTenantKey()).isEqualTo("t11");
	Assertions.assertThat(medupdate.getUserKey()).isEqualTo("user1");
}

@Test
@Order(5)
@Rollback(value = false)
public void deleteMedicalDetails() {
	MedicalDetails med = medicalRepsitory.findByDocumentId(1);
	medicalRepsitory.delete(med);

}
}
