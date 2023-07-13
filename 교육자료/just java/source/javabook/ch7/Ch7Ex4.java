package javabook.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ch7Ex4 {

	public static void main(String[] args) {
		File rfile = new File("c:/dev/tmpfile.txt");
		File wfile = new File("c:/dev/tmpfile_new.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			while((s=reader.readLine()) != null) {
				writer.write(s+"-라인종료");
			}
			reader.close();
			writer.close();
			rfile.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done...");
	}

}
