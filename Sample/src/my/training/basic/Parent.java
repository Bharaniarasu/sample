package my.training.basic;

public class Parent {
	public static void main(String args[]) {
		// System.out.println(a);
		Parent pa = new Parent();
		pa.doCopy();
	}
	public int a = 12;
	protected String name = "hello";
	char k = 'k';

	private int b = 32;

	protected int doCopy() {
		System.out.println(a);
		System.out.println("protected");
		return b;

	}

	public void doFarm() {
		System.out.println("parent");
	}
}
