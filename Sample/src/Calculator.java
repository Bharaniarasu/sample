import java.util.Scanner;

public class Calculator {
	
	int firstValue;
	int secondValue;
	Scanner sc ;
	int doAdd(int firstValue, int secondValue) {
		sc = new Scanner(System.in);
		System.out.println("enter values to addition");
		int value = sc.nextInt()+sc.nextInt();
		return value;
	}

	int doSub(int firstValue, int secondValue) {
		sc = new Scanner(System.in);
		System.out.println("enter values to subtraction");
		firstValue=sc.nextInt();
		secondValue=sc.nextInt();
		int value = firstValue - secondValue;
		return value;
	}

	int doMul(int firstValue, int secondValue) {
		sc = new Scanner(System.in);
		System.out.println("enter values to multiplication");
		firstValue=sc.nextInt();
		secondValue=sc.nextInt();
		int value = firstValue * secondValue;
		return value;
	}

	int doDiv(int firstValue, int secondValue) {
		sc = new Scanner(System.in);
		System.out.println("enter values to divition");
		firstValue=sc.nextInt();
		secondValue=sc.nextInt();
		int value = firstValue / secondValue;
		return value;
	}

	public static void main(String[] args) {
		char operator;
		Calculator calsi = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the operation + or- or * or /");
		operator = sc.next().charAt(0);
		System.out.println("Enter the first value");
		calsi.firstValue = sc.nextInt();
		System.out.println("Enter the Second value");
		calsi.secondValue =sc.nextInt();
		switch (operator) {
		case '+':

			System.out.println("addition of two value is  " + calsi.doAdd(calsi.firstValue, calsi.secondValue));
			break;
		case '-':

			System.out.println("subtraction of two value is  " + calsi.doSub(calsi.firstValue, calsi.secondValue));
			break;
		case '*':

			System.out.println("multiplication of two value is  " + calsi.doMul(calsi.firstValue, calsi.secondValue));
			break;
		case '/':

			System.out.println("divition of two value is  " + calsi.doDiv(calsi.firstValue, calsi.secondValue));
			break;
		default:
			System.out.println("you have entered an invalid operation");
		}
		sc.close();
	}

}
