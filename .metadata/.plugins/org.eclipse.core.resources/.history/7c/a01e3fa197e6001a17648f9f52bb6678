package com.piyush.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("department-service")
public interface DepartmentClient {

	@GetMapping("/api/v1/departments/{id}")
	public ResponseEntity<DepartmentReponseModel> getDepartmentById(@PathVariable int id);
}
