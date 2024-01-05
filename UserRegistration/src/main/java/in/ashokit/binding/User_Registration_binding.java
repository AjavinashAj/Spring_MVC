package in.ashokit.binding;

import lombok.Data;

@Data
public class User_Registration_binding {

	private String firstName;
	private String lastName;
	private String email;
	private Long phno;
	private String pwd;
	private String confPwd;
	private String addr;
}
