package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ioread2 {

	public static void main(String[] args) throws Exception {
		
		char c;
		File files = new File("E:\\core java raghu classes\\ioreadexample.txt"); 
		FileInputStream fis2 = null;
		try {

			fis2 = new FileInputStream(files);
		     byte b[] = new byte[fis2.available()]; 
			fis2.read(b);
			for(byte i : b) {
				if(i==0) {
					c = '-';
				}
				else {
					c = (char)i;	
					System.out.print  (c); 
				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			fis2.close();
		}
	}

}
