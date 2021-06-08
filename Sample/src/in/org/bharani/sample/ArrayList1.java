package in.org.bharani.sample;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList name = new ArrayList();
		name.add("hello");
		name.add("hai");
		name.add("hii");
		name.add(1, "vanakkam");
		System.out.println(name.contains("hsdjkfch"));
		for (Object obj : name) {
			System.out.println(obj);
		}
	}
}
