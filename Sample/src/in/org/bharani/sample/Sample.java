package in.org.bharani.sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	private static Object rollNumber;
	private static Object name;
	private static Object place;
	private static Object age;
	private static Object sex;
	private static Object mobileNumber;

	public static void main(String[] args) {
		Sample ip1 = new Sample();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the roll number of the Student to create list");
			rollNumber = sc.nextInt();

			System.out.println("Enter the Student's NAme ");
			name = sc.next();

			System.out.println("Enter the place of the Student");
			place = sc.next();

			System.out.println("Enter the age of the Student");
			age = sc.next();

			System.out.println("Enter Gender of the Student");
			sex = sc.next();

			System.out.println("Enter the Mobile Number");
			mobileNumber = sc.next();
			ArrayList<String> name = new ArrayList<String>();
			name.addAll(name);
			for (Object o : name) {
				System.out.println(name);
			}
		}

	}

}
