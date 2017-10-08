package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ioread3 {

	public static void main(String[] args) {
		char c;
		File file = null;
		try {
			file = new File("E:\\core java raghu classes\\ioreadexample.txt");
		} catch (Exception e) {

			e.printStackTrace();
		}

		byte[] barr = new byte[(int) file.length()];
		FileInputStream fis3 = null;
		try {
			fis3 = new FileInputStream(file);
			try { 
				fis3.read(barr);
				for(int i :barr) {
					c = (char)i;
					System.out.print(c);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
		finally {
			try {
				fis3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	} 


}
