package javaIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DataOut {

	public static void main(String[] args) throws IOException {
		try{
			FileOutputStream fout = new FileOutputStream("d:/abc.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			String src = "»ªË¶µçÄÔ¿¨Ë¹";
			byte[] b = new byte[1024];
			dout.writeUTF(src);
//			dout.writeInt(88);
//			dout.writeUTF("hello");
			dout.flush();
			dout.close();
		} catch (IOException e) {
			System.out.println("aaa");
		}
	}
	
	
}
