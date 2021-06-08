package my.training.basic;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class StudentArray {
	StudentGetSet s = new StudentGetSet();

	HashMap<Integer, StudentGetSet> data;

	private void saveData(StudentGetSet fi) {

				if (data == null) {
					data = new HashMap<Integer, StudentGetSet>();

				}
				data.put(s.getRollNumber(), fi);
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi = new File("C:\\Users\\BharAni\\Documents\\Java Files/Listarray.txt");
		if (!fi.exists()) {
			fi.createNewFile();
		}
		StudentGetSet[] array = new StudentGetSet[3];
		for (int i = 0; i < 3; i++) {
			StudentGetSet s = new StudentGetSet();
			array[i] = s;

			RandomAccessFile raf = new RandomAccessFile("ListArray", "rw");
			
			

		for (int j = 0; j < 3; j++) {
			s = new StudentGetSet();
			System.out.println(s.getRollNumber());
			System.out.println(s.getName());
			System.out.println(s.getPlace());
			System.out.println(s.getAge());
			System.out.println(s.getSex());
			System.out.println(s.getMobileNumber());
		}

	}

	}}
