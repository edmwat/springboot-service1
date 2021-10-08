package com.example.jibtest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://angular8-application-lhefrhbyia-uc.a.run.app/", maxAge = 3600)
@RestController
@RequestMapping(path="api/home")
public class Welcome {
	
	@GetMapping
	public Greeting welcome() {
		Greeting greet = new Greeting("Hi, welcome to jib "," Enjoy my one command dockerization!");
		return greet;
		
	}
}
