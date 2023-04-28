package com.example.demo.service;

import java.util.Map;

import com.example.demo.binding.LoginForm;
import com.example.demo.binding.UnlockAccFrom;
import com.example.demo.binding.UserForm;

public interface IUserService {
	
	public String registerUser(UserForm user);
	
	public String loginUser(LoginForm loginform);
	
	public String forgotpwd(String email);
	
	public String  checkUniqueEmail(String email);
	
	public Map<Integer, String> getCountries();
	public Map<Integer, String> getStates(Integer countryid);
	public Map<Integer, String> getCities(Integer stateid);
	
	public String unlockAccount (UnlockAccFrom accForm);;
	
	

}
