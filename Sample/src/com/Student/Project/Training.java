package com.Student.Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Training {
	HashMap data = new HashMap();
	StGetSet sgs = new StGetSet();
	Scanner sc = new Scanner(System.in);
	static Training t = new Training();

	public static void main(String[] args) {

		t.doSet();

	}

	public void doSet() {
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
		StudentFile stf = new StudentFile();
		t.writeObj(sgs);
	}

	public void writeObj(StGetSet sgs) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\BharAni\\Desktop\\New folder\\files1.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			StGetSet str=sgs;
			obj.writeObject(str);
			// obj.close();
			System.out.println("done");
			System.out.println("write   "+sgs);
			obj.writeObject(sgs);
			t.doRead();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void doRead() {
		try {
			FileInputStream fis=new FileInputStream("C:\\\\Users\\\\BharAni\\\\Desktop\\\\New folder\\\\files1.txt");
			int i=0;
				while(!((i=fis.read())==-1)) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public String toString() {
		return " " + sgs.getRollNumber() + "" + sgs.getName() + "" + sgs.getPlace() + "" + sgs.getAge() + ""
				+ sgs.getSex() + "" + sgs.getMoblileNUmber();

	}
		
	}


