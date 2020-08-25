package com.piyush.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.clients.DepartmentClient;

@RestController
@RequestMapping("/api")
public class OrchestrationController {

	private DepartmentClient departmentClient;
	
	
	public OrchestrationController(DepartmentClient departmentClient) {
		super();
		this.departmentClient = departmentClient;
	}


	@GetMapping("/orcs/departments/{id}")
	public ResponseEntity<Object> getDepartmentById(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(departmentClient.getDepartmentById(id));
	}
}
