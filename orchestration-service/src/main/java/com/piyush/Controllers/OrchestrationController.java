package com.piyush.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.clients.DepartmentClient;
import com.piyush.clients.GreetingsClient;

@RestController
@RequestMapping("/api")
public class OrchestrationController {

	private DepartmentClient departmentClient;
	private GreetingsClient greetingsClient;
	
	public OrchestrationController(DepartmentClient departmentClient, GreetingsClient greetingClient) {
		super();
		this.departmentClient = departmentClient;
		this.greetingsClient = greetingClient;
	}


	@GetMapping("/orcs/departments/{id}")
	public ResponseEntity<Object> getDepartmentById(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(departmentClient.getDepartmentById(id));
	}
	
	@GetMapping("/orcs/greetings/{name}")
	public ResponseEntity<String> getDepartmentById(@PathVariable String name){
		return ResponseEntity.status(HttpStatus.OK).body(greetingsClient.getGreetings(name));
	}
}
