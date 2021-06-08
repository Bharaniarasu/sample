import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\BharAni\\Desktop\\New folder//buffer.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		/*
		 * bw.write("hello"); bw.newLine(); bw.write("welcome"); bw.newLine();
		 * bw.write("all"); bw.flush(); bw.close();
		 */

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String out = br.readLine();
		int line = 0;
		int sentence = 0;
		int wordCount = 0;
		int charCount = 0;
		while (out != null) {
			System.out.println(out);
			String[] count = out.split("[.]");
			String[] word = out.split(" ");
			wordCount = wordCount + word.length;
			charCount = charCount + out.length();

			sentence = sentence + count.length;
			out = br.readLine();
			line++;
		}
		br.close();
		bw.close();
		
		System.out.println("count of lines are  " + line);
		System.out.println("count of sentences are  " + sentence);
		System.out.println("number of words are  " + wordCount);
		System.out.println("count of characters are  " + charCount);
	}

}
