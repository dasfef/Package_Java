package javabook.ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ch7Ex2 {

	public static void main(String[] args) {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
				
		try {
			int input = in.read();
			//String input = in.readLine();
			System.out.println(input);
			out.write(input);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
