package javaIO;

import java.io.ByteArrayInputStream;

public class ByteArrayIn {

	public static void main(String[] args) {
		byte[] dat = new byte[] {1,2,3,4};
		int b;
		for(int i=0; i<dat.length; i++){
			System.out.println(dat[i]);
		}
		ByteArrayInputStream bin = new ByteArrayInputStream(dat);
		while ((b = bin.read()) != -1){
			System.out.println(b);
		}

	}

}
