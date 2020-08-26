package com.piyush.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("greetings-service")
public interface GreetingsClient {
	
	@GetMapping("/api/greetings/{name}")
	public String getGreetings(@PathVariable String name); 
		
}
