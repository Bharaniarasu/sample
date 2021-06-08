import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\BharAni\\Desktop\\New folder\\mobile.txt");
		Scanner sc = new Scanner(file);
		boolean present = sc.hasNext();
		while (present) {
			String word = sc.next();
			int i = word.indexOf(":");
			String mobile = word.substring(i + 1);

			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(mobile);
			if (m.find()) {
				System.out.println(mobile + "  is a valid mobile number");
			} else {
				System.out.println(mobile + "  is not a valid number");
			}
			System.out.println(sc.hasNext());
			present = sc.hasNext();
		}
		sc.close();
	}

}
