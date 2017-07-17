package com.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:properties/devops.properties")
@Component
public class JMSDetail {

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
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "[" + ip + "," + port + "," + username +"," + password + "]";
	}
	
}
