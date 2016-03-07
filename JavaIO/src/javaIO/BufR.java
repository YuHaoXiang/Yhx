package javaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufR {

	public static void main(String[] args) throws IOException {

		BufferedReader bfr = new BufferedReader(new FileReader("d:/yhx.txt"));
//		char c = ' ';
//		while (c != '\n') {
//			c = (char) bfr.read();
//			System.out.print(c);
//		}
//		bfr.close();
		String s ;
		while((s=bfr.readLine()) != null) {
			System.out.print(s);
		}
		bfr.close();
	}

}
