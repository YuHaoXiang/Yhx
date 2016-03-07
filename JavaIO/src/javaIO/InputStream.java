package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStream {

	public static void main(String[] args) throws IOException {
		 File in = new File("J:/java/src" + File.separator + "yhx.data");
		 Reader read = new InputStreamReader(new FileInputStream(in));
		 char[] c = new char[1024];
		 int len = read.read(c);
		 read.close();
		 System.out.println(new String(c, 0, len));
	}
}
