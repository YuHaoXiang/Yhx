package javaIO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DateIn {

	public static void main(String[] args) {
		int n = 0;
		String s = null;
		try {
//				File file = new File("d:/abc.txt");
//				FileInputStream bin = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(new FileInputStream("d:/yhx.txt"));
				byte[] b = new byte[dis.available()];
				int c ;
				while ((c =  dis.read(b)) != -1) {
					System.out.println(new String(b));
				}
//				n=dis.readInt();
//				s=dis.readUTF();
//				System.out.println(s+" "+n);
			} catch (Exception e) {
					System.out.println("aaa");
			}
	}

}
