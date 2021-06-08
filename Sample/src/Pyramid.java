
public class Pyramid {

	public static void main(String[] args) {
		int row = 5;
		int count = 0;
		int count1 = 0;
		int k = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= row; j++) {
				System.out.print("_ ");
				count++;
			}
			while (k < 2 * i - 1) {
				if (count < row ) {
					System.out.print((i + k) + " ");
					count++;
				} else {
					System.out.print((i + k - 2 * count1) + " ");
					count1++;
				}
				++k;

			}
			count = count1 = k = 0;
			System.out.println();
		}
	}

}
