import java.util.Comparator;

public class Sample implements Comparator {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = (String) o2;
		if (s1.length() > s2.length()) {
			return -2;
		} else if (s1.length() < s2.length()) {
			return +2;

		} else 
			return 0;
		}
		
	}


