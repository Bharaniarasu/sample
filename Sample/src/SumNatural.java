
public class SumNatural {

	public static void main(String[] args) {
		int num = 36,n2=61;
		int out = sumNumber(num,n2);
		System.out.println(" sum " + out);
	}

	static int sumNumber(int number, int num) {

		if (num!=0) {
			return sumNumber(num,number%num);
		} else {
			return number;
		}
	}

}
