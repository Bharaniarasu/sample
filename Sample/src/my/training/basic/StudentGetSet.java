package my.training.basic;

import java.util.Scanner;

public class StudentGetSet {
	public int rollNumber;
	public String name;
	public String place;
	public String age;
	public String sex;
	public String mobileNumber;

	public StudentGetSet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rollNumber");
		this.setRollNumber(sc.nextInt());
		System.out.println();
		System.out.println("enter the Name");
		this.setName(sc.next());
		System.out.println("enter the Place");
		this.setPlace(sc.next());
		System.out.println("enter the Age");
		this.setAge(sc.next());
		System.out.println("enter the Gender");
		this.setSex(sc.next());
		System.out.println("enter the MobileNumber");
		this.setMobileNumber(sc.next());
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
		this.age = age;
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

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
