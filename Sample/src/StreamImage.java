import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamImage {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Users\\BharAni\\Desktop\\New folder//image.jpg");
			OutputStream os = new FileOutputStream("C:\\Users\\BharAni\\Desktop\\New folder//newImage.jpg");
			int read = is.read();
			while (read != -1) {
				os.write(read);
				read = is.read();
			}
			os.flush();
			System.out.println("file written");
			os.close();
			is.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
