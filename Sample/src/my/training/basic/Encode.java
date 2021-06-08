package my.training.basic;

public class Encode {
	public static void main(String args[]) {
		Encode en = new Encode();
		String input = en.getIn();
		for (int i = 0; i < input.length(); i++) {

			char n = input.charAt(i);
			// System.out.println(n);
			int in = n;
			// System.out.println(in);
			String input1 = Integer.toBinaryString(in);
			en.st = en.st + input1;
			System.out.println(en.st);
			int count = 0;
			while (count > 7) {

			}
			int dec = Integer.parseInt(en.st, 2);
			System.out.println(dec);
		}
	}

	String st = "";

	public String getIn() {
		String name = "hello";
		return name;
	}
}
