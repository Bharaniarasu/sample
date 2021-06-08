import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// File file = new File("C:\\Users\\BharAni\\Desktop\\New folder\\fileEx.txt");
		File f = null;
		try{
			f= new File("F:\\file.txt");
			if(f.exists()) {
				f.createNewFile();
			}
		}catch(NullPointerException io)
		{
			System.out.println("null");
		}
		System.out.println(f.getPath());
		 
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeBytes("hello \nwelcome\n all");
		
		System.out.println(raf.readLine());
		f.deleteOnExit();
		raf.close();
		
	}
}