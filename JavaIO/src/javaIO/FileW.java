package javaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileW {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:/abc.txt");
		fw.write("�����");
		fw.write(";");
		fw.write("����");
		fw.write(";");
		fw.write("����");
		fw.write(";");
		fw.flush();
		fw.close();
	}
}
