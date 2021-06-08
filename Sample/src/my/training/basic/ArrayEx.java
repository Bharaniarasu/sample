package my.training.basic;

public class ArrayEx {

	public static void main(String[] args) {

		/*
		 * int key=16;int i=0; while(i<marks.length){ if(key==marks[i]) {
		 * System.out.println("the value  "+ key+"  is present on  "+i+"  element");
		 * break; } i++;
		 * 
		 * } if(marks.length==i) { System.out.println("invalid input"); }
		 */
		/*
		 * int temp=marks[0]; int temp1=marks[1]; int i=0; while(i<marks.length-2) {
		 * marks[i]=marks[i+2]; i++; }marks[marks.length-1]=temp1;
		 * marks[marks.length-2]=temp; for(Integer in:marks) { System.out.println(in); }
		 */
		int marks[] = { 10, 20, 30, 40, 50 };
		/*
		 * int n=marks.length-1; System.out.println(n); int
		 * temp=marks[n],temp1=marks[n-1]; while(n>1) { marks[n]=marks[n-2]; n--; }
		 * marks[0]=temp1;marks[1]=temp; for(Integer in:marks) { System.out.println(in);
		 * }
		 */
		/*
		 * int[] newMarks=new int[marks.length]; int i=0,j=marks.length-1;
		 * while(i<marks.length) { newMarks[i]=marks[j]; i++;j--; }for(Integer
		 * in:newMarks){ System.out.println(in); }
		 */
		int arr[] = { 12, 20, -30, 45, -60, -70 };
		int i = 0, count = 0;
		while (i < arr.length) {
			if (0 > arr[i]) {
				System.out.print("  " + arr[i]);
				count++;
			}
			i++;
		}
		int[] array = new int[count];
		int j = 0, m = 0;
		System.out.println("\n values in array are ");
		while (j < arr.length) {
			if (0 > arr[j]) {
				array[m] = arr[j];
				m++;
			}
			j++;
		}
		for (Integer in : array) {
			System.out.println(in);

		}
		int n = 0, x = array.length - 1;
		while (x > 0) {
			int temp = array[n];
			array[n] = array[x];
			array[x] = temp;
			n++;
			x--;
		}
		for (Integer in : array) {
			System.out.println("------>" + in);

		}
	}
}
