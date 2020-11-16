package com.service;

import java.util.List;
import com.entity.User;

public interface UserService {
	
	public User saveOrUpdateUser(User user);
	
	public void deleteUser(Long id);
	
	public User findById(Long id);
	
	public List<User> findAll();

}
