
public class Reverse {

	public static void main(String[] args) {
		String name = "welcome all of you";

		char[] reverse = name.toCharArray();
		char[] arr = new char[reverse.length];
		int left = 0, right = 0;
		char temp = 0;
		right = reverse.length - 1;
		while (reverse.length / 2 < right) {
			temp = reverse[left];
			reverse[left] = reverse[right];
			reverse[right] = temp;
			left++;
			right--;

		}

		for (char c : reverse) {
			System.out.print(c);
		}

	}

}
