package com.dakr.binding;

import lombok.Data;

@Data
public class ForgetPasswordBinding {
	
	private Long phno;
	private String email;
	private String pwd;
	private String confPwd;
	

}
