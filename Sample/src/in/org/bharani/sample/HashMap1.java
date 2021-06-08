package in.org.bharani.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		name.put(6, "6");
		name.put(7, "7");
		name.put(5, "5");
		name.put(null, "3");
		name.put(1, "1");
		name.put(4, null);
		name.put(1, "4");

		Set<Integer> se = name.keySet();
		Iterator<Integer> key = se.iterator();
		while (key.hasNext()) {
			System.out.println(name.get(key.next()));
		}

	}

}
