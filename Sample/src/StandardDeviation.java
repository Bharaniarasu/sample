
public class StandardDeviation {

	public static void main(String[] args) {
		double arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double std = doStd(arr);
		System.out.println(std);
	}

	static double doStd(double[] arr) {

		double sum = 0;
		for (double ar : arr)
			sum += ar;

		double invert = sum / arr.length;
		double stDev = 0;
		for (double sd : arr)
			stDev += Math.pow((sd - invert), 2);
		return Math.sqrt(stDev / arr.length);
	}

}
