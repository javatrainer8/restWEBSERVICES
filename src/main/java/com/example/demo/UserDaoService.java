package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UserDaoService {
	public static int usersCount=4;
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Ricky", new Date()));
		users.add(new User(2,"Lucky", new Date()));
		users.add(new User(3,"Tricky", new Date()));
		users.add(new User(4,"John", new Date()));
		}
	public List<User> findAll(){
		return users;
	}
	
	
	public User save(User user) {
		if (user.getId()==null)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		for(User user:users)
		{
	if (user.getId()==id)
		return user;

}
return null;
		}}
