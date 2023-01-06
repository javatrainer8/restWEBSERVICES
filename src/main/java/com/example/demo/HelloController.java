
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET, path="/hello")  // localhost:8080/hello
	public String hello() {
		return " This is my first rest controller.  My name is Ricky";
	}
	
	@GetMapping(path= "/first")  // localhost:8080/first
	public String firstmethod() {
		return " This is another controller using getmapping annotation";
	}
	@GetMapping(path="/bean")      // localhost:8080/bean
	public EmployeeBean mybean() {
		return new EmployeeBean( "Ricky Ponting", 45);
		}

}
