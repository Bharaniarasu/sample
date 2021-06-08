
public class PyramidReverse {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=0;i--) {
			for(int j=i;j<=row;j++) {
				System.out.print("  ");
			}
			for(int m=i;m<=2*i-2;m++) {
				System.out.print(" *");
			}for(int n=0;n<=i-1;n++) {
				System.out.print(" +");
			}System.out.println();
		}
	}

}
