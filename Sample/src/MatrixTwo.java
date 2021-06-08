import java.util.Scanner;

public class MatrixTwo {

	public static void main(String[] args) {
		int arr[][] = new int[6][];
		arr[0] = new int[4];
		arr[1] = new int[7];
		arr[2] = new int[2];
		arr[3] = new int[13];
		arr[4] = new int[1];
		arr[5] = new int[7];
		// System.out.println(arr[1].length);
		Scanner sc = new Scanner(System.in);
		int row = 0;int i=1;
		while (row < arr.length) {
			int col = 0;
			while (col < arr[row].length) {
				arr[row][col] = i;
				col++;i++;
			}
			row++;
		}
		for (int[] ar : arr) {
			for (int a : ar) {

				System.out.print(" " + a);
			}System.out.println();
		}
	}

}
