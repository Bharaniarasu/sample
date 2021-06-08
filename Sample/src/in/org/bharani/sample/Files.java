package in.org.bharani.sample;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Files {

	public static void main(String[] args) throws IOException {
		File data = new File("C:\\Users\\BharAni\\Documents\\Java Files/userData.txt");
		if (!data.exists()) {
			data.createNewFile();
		}
		// System.out.println("i am new file");
		RandomAccessFile raf = new RandomAccessFile(data, "rw");
		raf.writeBytes("hello ,welcome, all 123");
		raf.seek(0);
		String rawdata = raf.readLine();
		System.out.println(rawdata);
		String val[] = rawdata.split(",");
		for (String st : val) {
			System.out.println(st);
		}

	}

}
