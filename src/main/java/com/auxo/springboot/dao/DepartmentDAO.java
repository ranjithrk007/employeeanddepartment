package com.auxo.springboot.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auxo.springboot.model.Department;
import com.auxo.springboot.repository.DepartmentRepository;

@Service
public class DepartmentDAO {
	@Autowired
	DepartmentRepository departmentRepository;
	
	//to save an department
	public Department save(Department dprt) {
		return departmentRepository.save(dprt);
	}
	
	
	//search all department
	public List<Department> findAll(){
		return departmentRepository.findAll();
	}
	
	//get an department by id
	
	public Department findOne(Long dprtid) {
		return departmentRepository.findById(dprtid).orElse(null);
	}
	
	
	// delete an Department
	public void delete(Department dprt) {
		departmentRepository.delete(dprt);
	}

}

