//package com.proretention.user;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//import com.proretention.user.entity.UserEntity;
//import com.proretention.user.repository.UserRepository;
//
//@DataJpaTest
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 
//public class UserRepositoryTest {
//	@Autowired
//	private UserRepository userRepository;
//
//	@Test
//
//	@Order(1)
//
//	@Rollback(value = false)
//	public void saveuserTest() {
//		UserEntity user = UserEntity.builder().firstName("barath").lastName("kumar").userId(1)
//				.build();
//		userRepository.save(user);
//		Assertions.assertThat(user.getUserId()).isGreaterThan(0);
//	}
//
//	@Test
//
//	@Order(2)
//	public void getUser() {
//		UserEntity user = userRepository.getByUserId(1);
//		Assertions.assertThat(user.getFirstName()).isEqualTo("barath");
//	}
//
//	@Test
//
//	@Order(4)
//
//	@Rollback(value = false)
//	public void updateUser() {
//		UserEntity user = userRepository.getByUserId(1);
//		user.setFirstName("raj");
//		;
//		UserEntity upadteduser = userRepository.save(user);
//		Assertions.assertThat(upadteduser.getFirstName()).isEqualTo("raj");
//	}
//
//	@Test
//
//	@Order(5)
//
//	@Rollback(value = false)
//	public void deleteUserTest() {
//
//		UserEntity user1 = userRepository.getByUserId(1);
//
//		userRepository.delete(user1);
//		UserEntity user2 = userRepository.getByUserId(1);
//
//		Assertions.assertThat(user2).isNull();
//	}
//
//
//}
