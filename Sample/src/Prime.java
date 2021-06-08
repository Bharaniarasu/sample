import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int start = 3;
		int stop = 38;

		int count = 1;
		while (start < stop) {
			boolean prime = true;
			int i = 2;
			while (start > i) {
				if (start % i == 0) {
					prime = false;
				}
				i++;
			}
			if (prime == true) {
				System.out.println(start + "  it is a prime");
				count++;
			}
			start = start + 1;
		}
	}

}
