package com.yndg.springboot;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestMariaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println(">>>>>>>> sqlFactory :" + sqlFactory);
	}

	@Test
	public void testSession() {
		try (SqlSession session = sqlFactory.openSession()) {
			System.out.println(">>>>>>> session : " + session + "\n");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	
}
