package javaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileW {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:/abc.txt");
		fw.write("ÓàºÆÏè");
		fw.write(";");
		fw.write("ºþ±±");
		fw.write(";");
		fw.write("ÏåÑô");
		fw.write(";");
		fw.flush();
		fw.close();
	}
}
