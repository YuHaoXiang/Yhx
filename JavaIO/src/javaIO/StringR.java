package javaIO;

import java.io.IOException;
import java.io.StringReader;

public class StringR {

	public static void main(String[] args) throws IOException {
		StringReader strR = new StringReader("´ó¼ÒºÃ£¡");
		int data;
		while ((data=strR.read()) != -1) {
			System.out.print((char)data+" ");
		}
		strR.close();
	}
}
