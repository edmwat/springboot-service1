package com.example.jibtest;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = {"https://angular8-application-lhefrhbyia-uc.a.run.app","http://localhost:8080"}, maxAge = 3600)
@RestController
@RequestMapping(path="api/home")
public class Welcome {
	
	private final WebClient client;
	
	public Welcome() {
		client = WebClient.builder()
		        .baseUrl("https://springservice2-lhefrhbyia-uc.a.run.app")
		        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
		        .build();
	}
	@GetMapping 
	public Mono<Greeting> welcome() {
		return client.get()
		        .uri("/api/gfactory")
		        .retrieve()
		        .bodyToMono(Greeting.class);		 
	}
}
