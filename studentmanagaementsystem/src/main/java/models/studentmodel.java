package models;

public class studentmodel {
	private String Pinnum;
	private String name;
	private String email;
	private String branch;
	public String getPinnum() {
		return Pinnum;
	}
	public void setPinnum(String pinnum) {
		Pinnum = pinnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public studentmodel(String pinnum, String name, String email, String branch) {
		super();
		Pinnum = pinnum;
		this.name = name;
		this.email = email;
		this.branch = branch;
	}
	public studentmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
