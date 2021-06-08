package in.org.bharani.sample;

import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class UserOperations {

	public static void main(String[] args) throws IOException {
		int count = 1;
		String newFile = "newFile";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of Students to Create list");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.println("Student Details");
			System.out.println("Enter the Roll Number");
			int r = sc.nextInt();
			System.out.println("Enter the Name");
			String n = sc.next();
			System.out.println("Enter the place");
			String p = sc.next();
			System.out.println("Enter the age");
			String a = sc.next();
			System.out.println("Enter the Gender");
			String s = sc.next();
			System.out.println("Enter the Mobile Number");
			String m = sc.next();

			newFile = newFile + count;
			UserData ud = new UserData(r, n, p, a, s, m);
			File fi = new File("C:\\Users\\BharAni\\Documents\\Java Files/" + newFile + ".txt");
			if (!fi.exists()) {
				fi.createNewFile();
			}
			RandomAccessFile raf = new RandomAccessFile(fi, "rw");
			raf.writeBytes("  " + ud.getRollNumber());
			raf.writeBytes("  " + ud.getName());
			raf.writeBytes("  " + ud.getPlace());
			raf.writeBytes("  " + ud.getAge());
			raf.writeBytes("  " + ud.getSex());
			raf.writeBytes("  " + ud.getMobileNumber());
			count++;
		
			raf.close();
		}
		sc.close();

	}

}
