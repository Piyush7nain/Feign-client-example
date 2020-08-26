package com.Piyush.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingsController {
	
	@GetMapping("/greetings/{name}")
	public String getGreetings(@PathVariable String name) {
		return "Welcome " + name;
	}

}
