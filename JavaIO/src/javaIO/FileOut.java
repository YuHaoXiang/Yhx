package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) throws IOException {
		
			FileInputStream inStream = new FileInputStream("J:/java/src/yhx.txt");
			FileOutputStream outStream = new FileOutputStream("J:/java/src/newyhx.txt");
			byte[] inoutb = new byte[(inStream.available())];
			inStream.read(inoutb);
			outStream.write(inoutb);
			inStream.close();
			outStream.close();
			
	}
}