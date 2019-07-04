package com.auxo.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auxo.springboot.dao.DepartmentDAO;
import com.auxo.springboot.model.Department;

@RestController
@RequestMapping("/dprt")
public class DepartmentController {
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	/* to save an department*/
	@PostMapping("/dprtrole")
	public Department createDepartment(@Valid @RequestBody Department dprt) {
		return departmentDAO.save(dprt);
	}
	
	
	/* get all departments*/
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentDAO.findAll();
	}
	/*get department by dprtid*/
	@GetMapping("/notes/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable(value="id") Long dprtid){
		Department dprt = departmentDAO.findOne(dprtid);
		
		if(dprt==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(dprt);
	}
	
	/*update an department by dprtid*/
	
	@PutMapping("/departments/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable(value="id") Long dprtid,@Valid @RequestBody Department dprtDetails){
		
		Department dprt = departmentDAO.findOne(dprtid);
		if(dprt==null) {
			return ResponseEntity.notFound().build();
		}
		dprt.setDprtid(dprtDetails.getDprtid());
	
		
		
		Department updateDepartment=departmentDAO.save(dprt);
		return ResponseEntity.ok().body(updateDepartment);
		
	}
	/*Delete an department*/
	@DeleteMapping("/departments/{id}")
	public ResponseEntity<Department> deleteDepartment(@PathVariable(value="id") Long dprtid){
		Department dprt = departmentDAO.findOne(dprtid);
		if(dprt==null) {
			return ResponseEntity.notFound().build();
		}
		
		departmentDAO.delete(dprt);
		return ResponseEntity.ok().build();
	}
}

