package com.kxy.demo.model;

public class ReportEntity {

	private String pkid;
	private String userName;
	private Integer age;
    private String schoolName;
    private String schoolId;
	public String getPkid() {
		return pkid;
	}
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public ReportEntity(String pkid, String userName, Integer age, String schoolName, String schoolId) {
		super();
		this.pkid = pkid;
		this.userName = userName;
		this.age = age;
		this.schoolName = schoolName;
		this.schoolId = schoolId;
	}
	public ReportEntity() {
		super();
	}

}
