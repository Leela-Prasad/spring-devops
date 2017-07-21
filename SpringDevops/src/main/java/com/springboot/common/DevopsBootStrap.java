package com.springboot.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.springboot.domain.Employee;
import com.springboot.repositories.EmployeeRepository;

@Component
@EnableJpaRepositories(basePackages={"com.springboot.repositories"})
public class DevopsBootStrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(empRepository.findAll().size()==0) {
			Employee emp = new Employee();
			emp.setEmpName("new employee");
			emp.setDesignation("Analyst");
			emp.setSalary(2000);
			empRepository.save(emp);
		}
		
	}

	
}
