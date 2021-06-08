package com.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("dosa");
		System.out.println(s);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\BharAni\\Desktop\\New folder\\StudentList.txt");

		p.setProperty("dosa", "430");
		p.store(fos, "done");

	}

}
