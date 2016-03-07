package javaIO;

import java.io.File;
import java.util.ArrayList;

public class FileDome {
	
	public static void main(String[] args) {
		try {
			File file = new File("c:/bootmgr");
			if(file.isFile()){
				System.out.println(file+"是一个文件");
				System.out.println(file.canRead()?"可读":"不可读");
				System.out.println(file.length());
			} else {
				File[] files = file.listFiles();
				ArrayList<File> fileList = new ArrayList<File>();
				for(int i=0; i<files.length; i++) {
					if(files[i].isDirectory()) {
						System.out.println("["+files[i].getPath()+"]");
					} else {
						fileList.add(files[i]);
					}
				}
				for (File f : fileList){
					System.out.println(f.toString());
				}
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("aaa");
		}
	}

}
