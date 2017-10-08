package iodemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {

		byte b[] = new byte[100]; 
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\core java raghu classes\\ioreadexample.txt");

			int read = fis.read();
			
			fis.skip(4);
			while(read!= -1) {
				System.out.print((char)read);
				read = fis.read();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}


	}
}


