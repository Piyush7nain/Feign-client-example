package com.piyush.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.Services.DepartmentService;
import com.piyush.models.Department;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	private DepartmentService service;

	public DepartmentController(DepartmentService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/departments")
	public ResponseEntity<Iterable<Department>> getAllDepartments(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllDepartments());
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<Department> getAllDepartments(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(service.getDepartmentById(id));
	}
}
