import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Object o1, Object o2) {
		String a =  (String) o1;
		String b =  (String) o2;
		int result = a.compareTo(b);
		if (a.length()>b.length()) {
			return 1;
		} else if (a.length()<b.length()) {
			return -1;
		} else {
			return 0;
		}
	}
}
