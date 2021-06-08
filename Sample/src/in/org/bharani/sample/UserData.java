package in.org.bharani.sample;

import java.util.InputMismatchException;

public class UserData {

	private int rollNumber;
	private String name;
	private String place;
	private String age;
	private String sex;
	private String mobileNumber;

	public UserData(int r, String string, String string2, String string3, String string4, String string5) {

		this.rollNumber = r;
		this.name = string;
		this.place = string2;
		this.age = string3;
		this.sex = string4;
		this.mobileNumber = string5;
	}

	public String getAge() {
		return age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setAge(String age) {
		try {
			this.age = age;
		} catch (InputMismatchException imm) {
			System.out.println("please Enter a Integer value");
		}
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setRollNumber(int rollNumber2) {
		this.rollNumber = rollNumber2;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
