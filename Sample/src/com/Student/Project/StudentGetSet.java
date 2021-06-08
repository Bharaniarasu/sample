package com.Student.Project;

public class StudentGetSet {

	private int rollNumber;
	private String name;
	private String place;
	private String age;
	private String sex;
	private String mobileNumber;
/*
	StudentGetSet(String rn, String na, String pl, String ag, String se, String mob) {
		this.setRollNumber(rn);
		this.name = na;
		this.place = pl;
		this.age = ag;
		this.sex = se;
		this.mobileNumber = mob;
	}*/

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;

	}

	public String getSex() {
		return sex;
	}

	public void SetSex(String sex) {
		this.sex = sex;
	}

	public String getMoblileNUmber() {
		return mobileNumber;

	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String toString() {
		return " "+rollNumber+" "+name+" "+place+" "+age+" "+sex+" "+mobileNumber;

	}
}
