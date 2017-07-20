package com.springboot.loading.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:properties/devops.properties" })
public class LoadingUsingPropertySource {

	@Value("${devops.jms.ip}")
	private String ip;
	@Value("${devops.jms.port}")
	private Integer port;
	@Value("${devops.jms.username}")
	private String username;
	@Value("${devops.jms.password}")
	private String password;

	public String getIp() {
		return ip;
	}

	public Integer getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public void displayProperties() {
		System.out.println("Loading using Value Annotation :" + ip + "," + port + "," + username + "," + password);
	}
	
}
