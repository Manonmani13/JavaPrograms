package com.proretention.organization;


import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import com.proretention.organization.entity.OrganizationDetails;
import com.proretention.organization.repository.OrganizationRepository;
@ContextConfiguration
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrganizationRepositoryTest {
	@Autowired
	OrganizationRepository organizationRepository;
	
	@Test
    @Order(1)
    @Rollback(value = false)
	public void saveOrganizationDetails()
	{
		OrganizationDetails orgDet=OrganizationDetails.builder()
				.aboutUs("good company")
				.address1("kadhanchavadi")
				.address2("chennai1")
				.bussinessType("IT")
				.city("chennai")
				.country("India")
				.createdBy("user")
				.createdate("12:30")
				.description("company")
				.insdustry("proretention")
				.locationUrl("kadhanchavadi.location")
				.organization("quscient")
				.organizationId(1)
				.state("tamilnadu")
				.tenantKey("t1")
				.updatedate("13:23")
				.websiteUrl("google.com")
				.zipCode(100)
				.updatedBy("user")
				.build();
		organizationRepository.save(orgDet);
		Assertions.assertThat(orgDet.getOrganizationId()).isGreaterThan(0);
	}
    @Test
    @Order(2)
    public void getOrganization()
    {
    	OrganizationDetails org=organizationRepository.findByTenantKey("t1");
    	Assertions.assertThat(org.getOrganizationId()).isEqualTo(1);
    }
    @Test
    @Order(3)
    public void  getListOfOrganization()
    {
    	List<OrganizationDetails> orgDet =organizationRepository.findAll();
    	Assertions.assertThat(orgDet.size()).isGreaterThan(0);
    }
    @Test
    @Order(4)
    @Rollback(value = false)
    public void  updateOrganization()
    {
    	OrganizationDetails org=organizationRepository.findByTenantKey("t1");
    	org.setAboutUs("best Company");
    	OrganizationDetails orgUpdate=organizationRepository.save(org);
    	Assertions.assertThat(orgUpdate.getAboutUs()).isEqualTo("best Company");
    	
    	
    }
    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteOrganization()
    {
    	OrganizationDetails org=organizationRepository.findByTenantKey("t1");
    	organizationRepository.delete(org);
    	
    }
    
}
