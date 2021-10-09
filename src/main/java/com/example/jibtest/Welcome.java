package com.example.jibtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = {"https://angular8-application-lhefrhbyia-uc.a.run.app","http://localhost:8080/api/home"}, maxAge = 3600)
@RestController
@RequestMapping(path="api/home")
public class Welcome {
	 
	@GetMapping
	public Greeting welcome() {
		
		Greeting greet = new Greeting("Hello, message from CEO,Edward MM ","Enjoy my one command dockerization!");
		return greet;	
		/*
		 * HttpHeaders headers = new HttpHeaders(); HttpEntity <String> entity = new
		 * HttpEntity<String>(headers);
		 * 
		 * try {
		 * 
		 * g = restTemplate.exchange(
		 * "https://springservice2-lhefrhbyia-uc.a.run.app/api/gfactory",
		 * HttpMethod.GET, entity, Greeting.class).getBody(); }catch(Exception ex) {
		 * System.out.println(ex.getMessage()); } return g;
		 */
		 
	}
}
