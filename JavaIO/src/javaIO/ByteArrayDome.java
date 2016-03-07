package javaIO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayDome {

	public static void main(String[] args) throws IOException {
		byte[] buff = null;
		String msg = "Çë²»ÒªËµÓ¢Óï,ok?";
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			out.write(msg.getBytes("UTF-8"));
			buff = out.toByteArray();
		} catch(IOException e ) { }
			System.out.println(new String(buff, "UTF-8"));
	}

}
