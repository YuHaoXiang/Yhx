package javaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Switch {

	public static void main(String[] args) throws IOException {
		BufferedReader FR = new BufferedReader(new FileReader("I:/cipher.txt"));
		BufferedWriter FW = new BufferedWriter(new FileWriter("I:/cipher1.txt"));
		String s;
		while((s=FR.readLine())!=null){
			System.out.println(s);
			FW.write(s.toLowerCase());
		}
		FW.close();
		FR.close();
		
	}

}
