package com.auxo.springboot.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auxo.springboot.model.Employee;
import com.auxo.springboot.repository.EmployeeRepository;






@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	//to save an employee

	
	public Employee save(Employee emp) {
		return	employeeRepository.save(emp);
		
	}
	
	
	//search all employee

	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	
	//get an employee by id 

	public Employee findOne(Long empid) {
		return employeeRepository.findById(empid).orElse(null);
	}
	
	
	// delete an employee
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
