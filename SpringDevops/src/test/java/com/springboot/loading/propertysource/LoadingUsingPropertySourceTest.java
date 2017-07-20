package com.springboot.loading.propertysource;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={LoadingUsingPropertySource.class})
public class LoadingUsingPropertySourceTest {

	private LoadingUsingPropertySource test;
	
	@Autowired
	public void setTest(LoadingUsingPropertySource test) {
		this.test = test;
	}

	@Test
	public void testProperties() {
		assertEquals("127.0.0.1",test.getIp());
		assertEquals(new Integer(8005),test.getPort());
		assertEquals("user",test.getUsername());
		assertEquals("password",test.getPassword());
		test.displayProperties();
	}

}
