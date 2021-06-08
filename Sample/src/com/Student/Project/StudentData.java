package com.Student.Project;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentData {
	Scanner sc; // = new Scanner(System.in);;
	StudentGetSet sgs;
	HashMap<Integer, StudentGetSet> data;

	private void doPrint() {
		// System.out.println(sgs);

		System.out.println("Roll Number :  " + sgs.getRollNumber());
		System.out.println("Name        :  " + sgs.getName());
		System.out.println("Place       :  " + sgs.getPlace());
		System.out.println("Age         :  " + sgs.getAge());
		System.out.println("Gender      :  " + sgs.getSex());
		System.out.println("MobileNumber:  " + sgs.getMoblileNUmber());

	}

	private void doSet() {
		try {
			sc = new Scanner(System.in);
			sgs = new StudentGetSet();
			System.out.println("enter rollNumber");
			sgs.setRollNumber(sc.nextInt());
			System.out.println("Enter the Student name");
			sgs.setName(sc.next());
			System.out.println("Enter place");
			sgs.setPlace(sc.next());
			System.out.println("Enter age");
			sgs.setAge(sc.next());
			System.out.println("Enter the gender");
			sgs.SetSex(sc.next());
			System.out.println("Enter the Mobile Number");
			sgs.setMobileNumber(sc.next());
		} catch (InputMismatchException ime) {
			System.out.println("--Enter a Valid Details--");
			doSet();
		}
	}

	private void createStudent() {
		doSet();
		saveData(sgs);

	}

	private void saveData(StudentGetSet sgs) {
		if (data == null) {
			data = new HashMap<Integer, StudentGetSet>();
		}
		data.put(sgs.getRollNumber(), sgs);
	}

	private void viewStudent() {
		sc = new Scanner(System.in);
		System.out.println("Enter the RollNumber to view the Student data");
		try {
			int rollNum = sc.nextInt();
			sgs = data.get(rollNum);
			doPrint();
		} catch (NullPointerException npe) {
			System.out.println("--Entered RollNumber Doesn't Exists--");
		} catch (InputMismatchException ime) {
			System.out.println("--Please Enter An integer value--");
			viewStudent();
		}
	}

	private void viewAllStudents() {
		try {
			System.out.println("All Students");
			System.out.println(data.values());
		} catch (NullPointerException npe) {
			System.out.println("--There is no Student Data is Registered--");
		}
	}

	private void studentUpdate() {
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the RollNumber to Update a Student data");
			int rollNum = sc.nextInt();
			sgs = data.get(rollNum);
			doPrint();
			System.out.println("Enter 1: to Exit Updater");
			System.out.println("Enter 2: to Update Student's RollNumber");
			System.out.println("Enter 3: to Update Student's Name");
			System.out.println("Enter 4: to Update Student's Place");
			System.out.println("Enter 5: to Update Student's Age");
			System.out.println("Enter 6: to Update Student's Sex");
			System.out.println("Enter 7: to Update Student's Mobile Number");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				dataController();
			case 2:
				System.out.println("Enter the New RollNumber to the Student");
				sgs.setRollNumber(sc.nextInt());
				System.out.println("Student RollNumber Updated");
				studentUpdate();
				break;
			case 3:
				System.out.println("Enter the New Name to the Student");
				sgs.setName(sc.next());
				System.out.println("Student Name Updated");
				studentUpdate();
				break;
			case 4:
				System.out.println("Enter the New Place to the Student");
				sgs.setPlace(sc.next());
				System.out.println("Student Place Updated");
				studentUpdate();
				break;
			case 5:
				System.out.println("Enter the New Age to the Student");
				sgs.setAge(sc.next());
				System.out.println("Student Age Updated");
				studentUpdate();
				break;
			case 6:
				System.out.println("Enter the New Sex to the Student");
				sgs.SetSex(sc.next());
				System.out.println("Student Sex Updated");
				studentUpdate();
				break;
			case 7:
				System.out.println("Enter the New MobileNumber to the Student");
				sgs.setMobileNumber(sc.next());
				System.out.println("Student MobileNumber Updated");
				studentUpdate();
				break;
			default:
				System.out.println("Enter a valid option");
				studentUpdate();
			}

		} catch (NullPointerException npe) {
			System.out.println("--The given RollNumber Doesn't Exists to Update");
			dataController();
		} catch (InputMismatchException ime) {
			System.out.println("--Please Enter an Integer Value to Update--");
			studentUpdate();
		}

	}

	private void removeStudent() {
		sc = new Scanner(System.in);
		System.out.println("Enter the RollNUmber to remove data");
		try {
			int rNo = sc.nextInt();
			data.remove(rNo);
			System.out.println("Removed Successfully");
		} catch (NullPointerException npe) {
			System.out.println("--The given RollNumber Doesn't Exists to Remove");
			dataController();
		} catch (InputMismatchException ime) {
			System.out.println("--Please Enter an Integer Value to Remove--");
			removeStudent();
		}
	}

	void dataController() {
		sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value for the operation");
			System.out.println("1   For CREATE Student List");
			System.out.println("2   For VIEW a Student data");
			System.out.println("3   For VIEW All Students Data");
			System.out.println("4   For Update a Student's data");
			System.out.println("5   For REMOVE aStudent data");
			System.out.println("6   For Exit from the OPeration");
			int value = sc.nextInt();
			switch (value) {
			case 1:
				createStudent();
				dataController();
				break;
			case 2:
				viewStudent();
				dataController();
				break;
			case 3:
				viewAllStudents();
				dataController();
				break;
			case 4:
				studentUpdate();
				dataController();
				break;
			case 5:
				removeStudent();
				dataController();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("--Please Enter a Valid key (1-5)--");
				dataController();
				break;
			}
		} catch (InputMismatchException ime) {
			System.out.println("--Please Enter a Valid Integer Key--");
			dataController();
		}
	}

	public static void main(String args[]) {
		StudentData sd = new StudentData();
		sd.dataController();
	}

}
