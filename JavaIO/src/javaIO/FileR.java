package javaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileR {

	public static void main(String[] args) throws IOException {
		FileReader src = new FileReader("d:/abc.txt");
		char c =' ';
		while ( c != '\n') {
			c = (char) src.read();
			System.out.print(c);
		}
		src.close();
	}
}
