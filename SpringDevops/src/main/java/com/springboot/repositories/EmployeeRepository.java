package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
