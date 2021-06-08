import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	String name="hello welcome all";
	int freq=0;
	char val='l';
	for(int i=0;i<name.length();i++) {
		if(val==name.charAt(i)) {
		freq++;
		}
	}System.out.println(freq);
	
	}

}
