package javaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamW {
	public static void main(String[] args) throws IOException {
		File file = new File("J:/java/src/yyhhxx.txt");
		Writer out = new OutputStreamWriter(new FileOutputStream(file));
		out.write("¼ÆÓ¦Ò»°à");
		out.close();
	}
}
