package javabook.ch11;

import java.io.*;

public class Ch11Ex1 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("/tmp/a.txt");
			System.out.println(fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}