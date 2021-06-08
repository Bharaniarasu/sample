import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsEx {

	public static void main(String[] args) {

		char arr[] = { 'a', 'f', 'b', 'h', 'd', 'y', 'i' };
		String[] names = { "name1","hi","haii", "vanakkam", "hello", "good", "name2", "bharani", "good" };

		for (String i : names) {
			System.out.print(" " + i);
		}
		Arrays.sort(names);

		System.out.println("  After  ");
		for (String j : names) {
			System.out.print(" " + j);
		}
		System.out.println();
		Comparator comp = new Sample();
		Arrays.sort(names, comp);
		for (String j : names) {
			System.out.print(" " + j);
		}
	}

}
