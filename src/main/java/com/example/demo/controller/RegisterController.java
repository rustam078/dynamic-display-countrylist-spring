package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.LoginForm;
import com.example.demo.binding.UnlockAccFrom;
import com.example.demo.binding.UserForm;
import com.example.demo.service.UserServiceImpl;

@RestController
@CrossOrigin(value = "*")
public class RegisterController {
	

	@Autowired
	private UserServiceImpl userservice;
	
	@PostMapping("/login")
	public ResponseEntity<String> login (@RequestBody LoginForm loginForm) {
		String status = userservice.loginUser(loginForm);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping("/countries")
	public Map<Integer, String> loadCountries() { 
		return userservice.getCountries();
	}
	
	@GetMapping("/states/{countryId}")
	public Map<Integer, String> loadStates (@PathVariable Integer countryId) { 
		return userservice.getStates(countryId);
	}
	
	@GetMapping("/cities/{stateId}")
	public Map<Integer, String> loadCities (@PathVariable Integer stateId) { 
		return userservice.getCities (stateId);
	}
	
	@GetMapping("/email/{email}")
	public String emailCheck (@PathVariable String email) { 
		return userservice.checkUniqueEmail(email);
	}
	
	@PostMapping("/user")
	public ResponseEntity<String> userRegistration (@RequestBody UserForm userForm) { 
		String status = userservice.registerUser(userForm); 
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@PostMapping("/unlock")
	public ResponseEntity<String> unlockAccount (@RequestBody UnlockAccFrom unlockAccForm) { 
		String status = userservice.unlockAccount (unlockAccForm);
	return new ResponseEntity<> (status, HttpStatus.OK);
	}
	
	@GetMapping("/forgotpwd/{email}")
	public ResponseEntity<String> forgotPwd (@PathVariable String email){ 
		String status = userservice.forgotpwd(email);
	return new ResponseEntity<>(status, HttpStatus.OK);

}
}
