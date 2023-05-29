package in.ashokit.binding;

public class Student {
	private Integer sid;
	private String sname;
	private String sroll;
	private Double marks;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSroll() {
		return sroll;
	}
	public void setSroll(String sroll) {
		this.sroll = sroll;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sroll=" + sroll + ", marks=" + marks + "]";
	}
	

}
