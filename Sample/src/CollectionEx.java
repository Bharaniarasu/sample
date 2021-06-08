import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('c');
		al.add('d');
		al.add('r');
		al.add('y');
		al.add('o');
		Collections.sort(al);
		System.out.println(al);
		int index1 = Collections.binarySearch(al, 's');
		System.out.println(index1);
	}

}
