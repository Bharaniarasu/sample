
public class AddMatrix {

	public static void main(String[] args) {
		int num1[][] = new int[3][3];
		int num2[][] = new int[3][3];
		int k = 0;
		for (int n = 0; n < num1.length; n++) {
			for (int m = 0; m < num2.length; m++) {
				num1[n][m] = k;
				k++;
			}
		}
		for (int n1 = 0; n1 < num2.length; n1++) {
			for (int m1 = 0; m1 < num2.length; m1++) {
				num2[n1][m1] = k + 1;
				k += 2;
			}
		}
		int[][] out = doMul(num1, num2);
		for (int[] arr : out) {
			for (int ar : arr) {
				System.out.print("  " + ar);
			}
			System.out.println();
		}
	}

	static int[][] doMul(int num1[][], int num2[][]) {
		int out[][] = new int[num1.length][num1[0].length];
		int i = 0;
		while (i < num1.length) {
			int j = 0;
			while (j < num1[0].length) {
				out[i][j] = num1[i][j] * num2[i][j];
				j++;
			}
			i++;
		}
		return out;
	}

}
