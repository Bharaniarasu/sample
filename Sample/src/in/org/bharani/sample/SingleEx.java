package in.org.bharani.sample;

public class SingleEx {

	// private Singleton value;

	public static void main(String[] args) {
// SingleEx se=new SingleEx();
		Singleton st1 = Singleton.getInstance();
		st1.name = "hello";
		Singleton st2 = Singleton.getInstance();
		System.out.println(st2.name);
		st2.name = "welcome";
		Singleton st3 = Singleton.getInstance();
		st3.name = "hello welcome";
		System.out.println(st1.name);

		System.out.println(st3.name);
		Singleton.st = null;
		Singleton snew = Singleton.getInstance();
		snew.name = "new";

	}

}
