package javaIO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayR {
	
	public static void main(String[] args) throws IOException{
		String strtmp = "��������ӵ绰���������ȹң��������ȹң�Oh yeah��";
		int lenth = strtmp.length();
		char[] c = new char[lenth];
		strtmp.getChars(0, lenth, c, 0);
		CharArrayReader input = new CharArrayReader(c);
		int i ; 
		while((i = input.read()) != -1){
			System.out.print((char)i);
		}
		input.close();
	}

}
