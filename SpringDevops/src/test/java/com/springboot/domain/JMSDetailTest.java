package com.springboot.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.config.JunitConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JunitConfig.class})
public class JMSDetailTest {

	private JMSDetail jmsDetail;
	
	@Autowired
	public void setJmsDetail(JMSDetail jmsDetail) {
		this.jmsDetail=jmsDetail;
	}
	
	@Test
	public void testJMSProperties() {
		assertEquals("127.0.0.1",jmsDetail.getIp());
		assertEquals(new Integer(8005),jmsDetail.getPort());
		assertEquals("user",jmsDetail.getUsername());
		assertEquals("password",jmsDetail.getPassword());
	}

}
