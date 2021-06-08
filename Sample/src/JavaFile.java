import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\BharAni\\Desktop\\New folder//newONe.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fileWrite = new FileWriter(file);
		fileWrite.write((int) 65);
		fileWrite.write("\nHello\nWelcome ");
		fileWrite.flush();
		
		fileWrite.close();

		FileReader fileRead = new FileReader(file);
		char[] fr=new char[(int) file.length()];
		System.out.println(fr.length);
		fileRead.read(fr);
		for(char f:fr) {
			System.out.print(f);
		}
		fileRead.close();
	}

}
