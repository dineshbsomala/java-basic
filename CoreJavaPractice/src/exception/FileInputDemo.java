package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputDemo {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\dines\\Desktop");
		}catch(FileNotFoundException e) {
			System.out.println("file is not found");
			e.printStackTrace();
		}
	}

}
