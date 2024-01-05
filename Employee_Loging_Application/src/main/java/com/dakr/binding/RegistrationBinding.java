package com.dakr.binding;

import lombok.Data;


@Data
public class RegistrationBinding {
	
	private String firstName;
	private String lastName;
	private Long phno;
	private String email;
	private String pwd;
	private String confPwd;
	

}
