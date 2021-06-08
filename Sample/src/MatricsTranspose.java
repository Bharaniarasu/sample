import java.util.Scanner;

public class MatricsTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int transepose[][] = new int[3][3];
		
		int row = 0, col = 0;

		
			

			for (row = 0; row < 3; row++) {
				for (col = 0; col < 3; col++) {
				System.out.println("enter the matrix values");
				transepose[row][col] = sc.nextInt();
				
			}

		}int total = 0,val=0;//a=0;
		for (int i=0;i<row;i++) {
			
			for (int j=0;j<col;j++) {
				//System.out.println(row);
				//val+=transepose[a][a];
				if(i==j) {
				total += transepose[i][j];}
				System.out.print("  " +transepose[i][j]);
	
			//a++;
			}System.out.print("  total of this row is  "+total);
			System.out.println();
			System.out.println("cross total is  "+val);
		

		}
	}

}
