import java.util.Arrays;
import java.util.Comparator;

public class StringEx implements Comparator {
	public int compare(Object o1, Object o2) {

	String a =  (String) o1;
	String b =  (String) o2;
	int result = a.compareTo(b);
	if (a.length()>b.length()) {
		return -1;
	} else if (a.length()<b.length()) {
		return 1;
	} else {
		return 0;
	}}

	public static void main(String[] args) {
		String value[]= {"asas","dfdg","sddsa","sdweagfrrwygte","aw"};
		//Arrays.sort(value);
		StringEx compDemo=new StringEx();
		Arrays.sort(value,compDemo);
		System.out.println(Arrays.toString(value));
		
		
	}
	}


