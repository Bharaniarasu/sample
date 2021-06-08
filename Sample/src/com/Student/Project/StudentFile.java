package com.Student.Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StudentFile {

	int value;
	Scanner sc = new Scanner(System.in);
	StudentFile sd;
	StGetSet sgs;
	HashMap<Integer, StGetSet> data;
	File file;

	private void createStudent() {
		sgs = new StGetSet();
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
		saveData(sgs);
	}

	private void saveData(StGetSet sgs) {
		if (data == null) {
			data = new HashMap<Integer, StGetSet>();
		}
		data.put(sgs.getRollNumber(), sgs);
		try {
			file = new File("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Roll Number   1:" + sgs.getRollNumber() + "");
			bw.newLine();
			bw.write("Name          :" + sgs.getName());
			bw.newLine();
			bw.write("Place         :" + sgs.getPlace());
			bw.newLine();
			bw.write("Age           :" + sgs.getAge());
			bw.newLine();
			bw.write("Gender 	      :" + sgs.getSex());
			bw.newLine();
			bw.write("Mobile Number  :" + sgs.getMoblileNUmber());
			bw.newLine();
			bw.write("z");
			bw.flush();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void viewStudent() {
		System.out.println("Enter the RollNumber to view the Student data");
		String[] arr = null;
		int count = 0;
		// String[] arr1 = new String[count];
		int i = 0;
		// sgs = data.get(sc.nextInt());
		try {
			FileReader fr = new FileReader("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");
			BufferedReader br = new BufferedReader(fr);

			try {
				String out = br.readLine();
				while (out != null) {
					arr = out.split("z");
					for (String a : arr) {
						System.out.println("[]" + a);
						count++;
						
						i++;
					}out = br.readLine();

				}
				// System.out.println(" __" + br.readLine());
				br.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			arraySplit(arr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void arraySplit(String[] arr) {
		String[] stu1 = Arrays.copyOfRange(arr, 0, 5);
		System.out.println("///" + Arrays.toString(stu1));

	}

	private void viewAll() {
		System.out.println("All Students");
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");
			BufferedReader br = new BufferedReader(fr);
			String out = br.readLine();
			while (out != null) {
				System.out.println(out);
				out = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println(data.values());
	}

	private void removeStudent() {
		file = new File("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Removed Successfully");
	}

	void studentDataBase() {
		System.out.println("Enter the value for the operation");
		System.out.println("1   For CREATE Student List");
		System.out.println("2   For VIEW a Student data");
		System.out.println("3   For VIEW All Students Data");
		System.out.println("4   For REMOVE aStudent data");
		System.out.println("5   For exit The operation");
		value = sc.nextInt();
		switch (value) {
		case 1:
			createStudent();
			studentDataBase();
			break;
		case 2:
			viewStudent();
			studentDataBase();
			break;
		case 3:
			viewAll();
			studentDataBase();
			break;
		case 4:
			removeStudent();
			studentDataBase();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("2Please Enter a valid input");
			studentDataBase();
		}

	}

	public static void main(String args[]) throws IOException {
		StudentFile sd = new StudentFile();
		sd.studentDataBase();
	}
}
