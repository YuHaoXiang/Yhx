package javaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferOut {

	public static void main(String[] args) {
		try {
			byte[] data = new byte[1];
			File srcFile = new File("J:/java/src/yhx.data");
			File desFile = new File("J:/java/src/asd.txt");
			BufferedInputStream BufIn = new BufferedInputStream(new FileInputStream(srcFile));
			BufferedOutputStream BufOut = new BufferedOutputStream(new FileOutputStream(desFile));
			System.out.println("复制文件:"+srcFile.length()+"字节");
			while(BufIn.read(data) != -1){
				BufOut.write(data);
				}
				BufOut.flush();
				BufOut.close();
				System.out.println("复制完成");
			
		} catch (Exception e ) {
			System.out.println("aaa");
		}
	}
}
