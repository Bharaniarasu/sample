package com.ils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	int a;
	int b, c;

	int DoDiv() {
	try { //throw new InputMismatchException("sorry");
	
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		a=sc.nextInt();
		System.out.println("enter the second value");
		b=sc.nextInt();
		c=a/b;
		
		System.out.println("the divided value is"+c);
		//return 0;
		sc.close();return a;
	}catch(NullPointerException npe) {
		}
	return a;
	}

	/*
	 * catch(ArithmeticException ae) { System.out.print("Exceptin fail"); }catch
	 * (InputMismatchException ime) { System.out.println("mismatched"); }
	 */
	/*
	 * finally {
	 * 
	 * System.out.println("final executed"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception ex = new Exception();
		ex.DoDiv();
	}

}
