package fr.lmsys.kubernates.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping(path="/api")
	public String sayHello(){
		return "hello men";
	}
	
	

}
