package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	@GetMapping("/users")                     //localhost:8080/users
	public List<User> retriveAllusers(){
		return service.findAll();
		
	}
	@GetMapping("/users/{id}")     // localhost:8080/users/3
	public User retriveUser(@PathVariable int id) {
		return service.findOne(id);
}
	                             // method that post a new user  
@PostMapping("/users")
public void createUser(@RequestBody User user) {
	User savedUser = service.save(user);
}

}
