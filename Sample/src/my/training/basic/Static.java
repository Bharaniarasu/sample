package my.training.basic;

public class Static {
	static int count = 0;
	public static void doPrint() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static st1 = new Static();
		Static st2 = new Static();
		Static st3 = new Static();
		doPrint();
	}

	int a = 9;

	public Static() {
		count++;
		System.out.println("count is " + count);
	}

}
