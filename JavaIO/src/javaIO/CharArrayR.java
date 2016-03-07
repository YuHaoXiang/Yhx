package javaIO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayR {
	
	public static void main(String[] args) throws IOException{
		String strtmp = "人生就像接电话，不是你先挂，就是我先挂！Oh yeah！";
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
