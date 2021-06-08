/**
 * 
 */
package com.ils;

/**
 * @author Bharni
 *
 */
public class NewOne {

	public static void main(String[] args) {
//	Scanner val=new Scanner(System.in);
//	System.out.println("enter 1st value=");
//	int a=val.nextInt();
//	int i;
//	//System.out.println("enter 2nd value=");
////	int b=val.nextInt();
//	for(i=1;i<=10;i++) {
//		
//	}
//	System.out.println(a+"*"+i+"="+(a*i) );
//val.close();
//	}
//	}
		/*
		 * for(int a=1;a<=3;a++) { System.out.println(); } for(int b=1;b<=3;b++) {
		 * System.out.print(b); } } }
		 */
		NewOne obj = new NewOne();
		obj.var2 = 20;
		if (obj.var1 < obj.var2) {
			System.out.println("var1 is greater");
		}
		if (obj.var2 < obj.var1) {
			System.out.println("var2 is greater");

		}
	}
	/**
	 * @param args
	 */
	int var1 = 10;

	int var2;
}
