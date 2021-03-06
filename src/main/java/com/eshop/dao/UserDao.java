package com.eshop.dao;

import java.util.List;

import com.eshop.model.User;


public interface UserDao {
	
	public boolean registerUser(User uobj);
	
	public User validateUser(int userId,String passsword);
	
	public List<User> getAllUsers();
	
	public boolean deleteUser(User uobj);
	
	public boolean updateUser(User uobj);
	
	public User getUserById(int userId);
	

}
