package in.org.bharani.sample;

import java.util.HashSet;
import java.util.Iterator;

public class Sets {
	public static void main(String args[]) {
		HashSet<String> data = new HashSet<String>();
		data.add("hello1");
		data.add("hello2");
		data.add(null);
		data.add("vanakkam");
		data.add("abc");
		data.add("hello2");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * for(String o: data) { System.out.println(o); }
		 */
		Object[] arr = data.toArray();
		// System.out.println(arr[2+1]);
	}
}
