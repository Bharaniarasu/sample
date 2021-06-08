
public class PyramidTri {

	public static void main(String[] args) {
		int row = 6;
		int tri = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < row - i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				if (k == 0 || i == 0) {
					tri = 1;
				} else {
					tri =tri* (i - k + 1) / k;
				}
				System.out.printf("%4d", tri);
			}
			System.out.println();
		}

	}

}
