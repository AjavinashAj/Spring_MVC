package in.ashokit.binding;

public class Register {
	
	private String name;
	private String addr;
	private String email;
	private Long phno;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", addr=" + addr + ", email=" + email + ", phno=" + phno + ", pwd=" + pwd
				+ "]";
	}
	
	

}
