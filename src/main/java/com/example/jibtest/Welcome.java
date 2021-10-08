package com.example.jibtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "https://angular8-application-lhefrhbyia-uc.a.run.app", maxAge = 3600)
@RestController
@RequestMapping(path="api/home")
public class Welcome {
	@Autowired 
	RestTemplate restTemplate;
	 
	@GetMapping
	public Object welcome() {
		try {
			HttpHeaders headers = new HttpHeaders();
			HttpEntity <String> entity = new HttpEntity<String>(headers);
			return restTemplate.exchange(
					"https://springservice2-lhefrhbyia-uc.a.run.app/api/gfactory", HttpMethod.GET, entity, Greeting.class).getBody();
			//Greeting greet = new Greeting("Hello, message from CEO,Edward MM "," Enjoy my one command dockerization!");
			//return greet;		
		}catch(Exception ex) {
			return ex;
			//System.out.println(ex.getMessage());
		}
		
	}
}
