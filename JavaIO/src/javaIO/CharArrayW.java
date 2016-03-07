package javaIO;

import java.io.CharArrayWriter;

public class CharArrayW {

	public static void main(String[] args) {
		
		CharArrayWriter f = new CharArrayWriter();
		String s = "º©±Æ";
		char[] buff = new char[s.length()];
	    s.getChars(0, s.length(), buff, 0);
	    f.write(buff, 0, s.length());
	    System.out.println(f.toString());
	}

}
