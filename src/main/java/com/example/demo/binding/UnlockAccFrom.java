package com.example.demo.binding;

import lombok.Data;

@Data
public class UnlockAccFrom {

	private String email;
	private String oldpassword;
	private String newpassword;
	private String conformpassword;
}
