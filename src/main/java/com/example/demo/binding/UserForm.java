package com.example.demo.binding;

import java.util.Date;

import lombok.Data;

@Data
public class UserForm {

	private String fname;
	private String lname;
	private String email;
	private String phone;
	private Date dob;
	private String gender;
	private Integer country;
	private Integer state;
	private Integer city;
}
