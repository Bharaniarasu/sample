package my.training.basic;

public class Child extends Parent {
	public static void main(String ards[]) {
		Child ch = new Child();
		ch.doCopy();
		ch.doFarm();
		ch.DoPrint();
		System.out.println(ch.bc);
	}

	public int bc;

	public void doFarm() {
		System.out.println("child");
	}

	private int DoPrint() {
		Child c = new Child();
		c.doCopy();
		bc = c.a;
		return bc;
	}

}
