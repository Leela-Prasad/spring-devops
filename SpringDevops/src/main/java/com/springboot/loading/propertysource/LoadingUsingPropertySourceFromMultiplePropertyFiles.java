package com.springboot.loading.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Leela
 * PropertySource Annotation will override the properties from the latter files specified in value 
 * attribute.
 * PropertySource Annotation will not override properties from external files instead it will override
 * from latter files from value attribute.
 * But Environment variables can override properties from all the files specified in propertysource 
 * annotation
 *
 */
@Component
@PropertySource(value = { "classpath:properties/devops.properties",
							"file:///Users/KRANTHI/Desktop/My computer/Leela/filesystem.properties"})
public class LoadingUsingPropertySourceFromMultiplePropertyFiles {

	@Value("${devops.jms.ip}")
	private String ip;
	@Value("${devops.jms.port}")
	private Integer port;
	@Value("${devops.jms.username}")
	private String username;
	@Value("${devops.jms.password}")
	private String password;
	@Value("${devops.region}")
	private String region;
	@Value("${environment}")
	private String enviroment;

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
	
	public String getRegion() {
		return region;
	}

	public void displayProperties() {
		System.out.println("Loading using Value Annotation :" + ip + "," + port + "," + username + "," + password + "," + region + "," + enviroment);
	}
	
}
