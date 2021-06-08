package in.org.bharani.sample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\BharAni\\Documents\\Java Files/writer.txt");
		fw.write("hai how are you");
		fw.flush();
		FileReader fr = new FileReader("C:\\Users\\BharAni\\Documents\\Java Files/writer.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.println(i);
			System.out.println((char) i);
		}
	}
}
