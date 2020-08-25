package com.piyush.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.clients.DepartmentClient;
import com.piyush.clients.DepartmentReponseModel;

@RestController
@RequestMapping("/api")
public class OrchestrationController {

	private DepartmentClient departmentClient;
	
	
	public OrchestrationController(DepartmentClient departmentClient) {
		super();
		this.departmentClient = departmentClient;
	}


	@GetMapping("/departments/{id}")
	public ResponseEntity<DepartmentReponseModel> getDepartmentById(@PathVariable int id){
		return departmentClient.getDepartmentById(id);
	}
}
