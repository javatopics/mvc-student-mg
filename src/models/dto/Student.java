package models.dto;

public class Student {

	private String name;
	private String roleNo;
	private String gender;
	public Student(){}
	public Student(String name,String roleNo,String gender){
		this.name=name;this.roleNo=roleNo;this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
