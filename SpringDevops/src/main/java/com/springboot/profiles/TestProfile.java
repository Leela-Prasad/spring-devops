package com.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestProfile {

	public TestProfile(@Autowired Environment env) {
		System.out.println("########################");
		System.out.println("########################");
		System.out.println("          Test          ");
		System.out.println("########################");
		System.out.println("########################");
		System.out.println(env.getProperty("devops.message"));
	}
}
