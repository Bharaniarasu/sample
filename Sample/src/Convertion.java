
public class Convertion {

	public static void main(String[] args) {
		long binary = 101001;
		int dec = doDecimal(binary);
		System.out.println(dec);
		int oct = doOctal(dec);
		System.out.println(oct);
	}

	private static int doOctal(int dec) {
		int i = 1;
		int oct = 0;
		while (dec != 0) {
			oct = oct + (dec % 8) * i;
			i = i * 10;
			dec /= 8;
		}
		return oct;
	}

	private static int doDecimal(long binary) {
		int i = 0;
		int rem = 0;
		int val = 0;
		while (binary != 0) {
			rem = (int) (binary % 10);
			val = (int) (val + (rem * Math.pow(2, i)));
			binary /= 10;
			i++;
		}
		return val;
	}

}
