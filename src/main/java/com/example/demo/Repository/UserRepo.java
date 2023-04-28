package com.example.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.LoginForm;
import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Serializable> {
	
 public User findByEmail(String email);
 
 public User findByEmailAndPassword(String email,String pwd);
}
