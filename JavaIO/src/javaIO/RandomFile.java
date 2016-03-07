package javaIO;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		char ch;
		try {
			while ((ch = (char)System.in.read()) != '\n') {
				buf.append(ch);
			}
				RandomAccessFile myFileStream = new RandomAccessFile("d:/yhx.txt", "rw");
				myFileStream.seek(myFileStream.length());
				myFileStream.writeBytes(buf.toString());
				myFileStream.close();
		
		} catch (Exception e ) {
			System.out.println("aaa");
		}
	}
}
