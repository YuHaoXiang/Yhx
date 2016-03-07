package javaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamDome {

	public static void main(String[] argc) {
		int num;
		byte[] dat = new byte[20];
		try {
			FileInputStream in = new FileInputStream("J:/java/src/Employee.java");
			while ((num = in.read(dat, 0, 20)) != -1){ 
				String s = new String(dat, 0, 20);
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("aaa");
		}
		
	}
}
