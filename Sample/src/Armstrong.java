
public class Armstrong {

	public static void main(String[] args) {
		/*
		 * int num = 153;// 153 is armstrong num
		 * 
		 * int copy = num; int rem = 0; int arm = 0; while (num > 0) { rem = num % 10;
		 * arm = arm + (rem * rem * rem); num = num / 10; }
		 * System.out.println("total value is  " + arm); if (arm == copy) {
		 * System.out.println(copy + "  is an armstrong number"); } else {
		 * System.out.println(copy + "  is not an armstrong number"); }
		 */

		int start = 99;
		int stop = 9999;
		for (int value = start + 1; value < stop; value++) {

			if (checkArm(value)) {
				System.out.print("  "+value);
			}
		}
	}

	public static boolean checkArm(int val) {
		int count = 0;
		int rem = 0;
		int arm = 0;
		int number = val;

		while (number != 0) {
			number = number / 10;
			count++;
		}
		number = val;
		while (number != 0) {
			rem = number % 10;
			arm = (int) (arm + (Math.pow(rem, count)));
			number = number / 10;
		}
		if (val == arm)
		return true;
		return false;
	}
}
