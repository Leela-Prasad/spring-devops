package com.springboot.loading.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value={"classpath:properties/devops.properties",
						"file:///Users/KRANTHI/Desktop/My computer/Leela/filesystem.properties"})
public class LoadingUsingEnvironmentInterface {
	
	private String ip;
	private Integer port;
	private String username;
	private String password;
	private String local; 
	
	public LoadingUsingEnvironmentInterface(@Autowired Environment env) {
		this.ip=env.getProperty("devops.jms.ip");
		this.port=env.getRequiredProperty("devops.jms.port", Integer.class);
		this.username=env.getProperty("devops.jms.username");
		this.password=env.getProperty("devops.jms.password");
		this.local=env.getProperty("devops.region");
	}
	
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public void displayProperties() {
		System.out.println(ip + "," + port + "," + username + "," + password + "," + local);
	}
	
	
	
}
