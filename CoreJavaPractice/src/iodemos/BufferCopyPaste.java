package iodemos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferCopyPaste {

	public static void main(String[] args) throws Exception {


		FileInputStream fis = new FileInputStream("E:\\core java raghu classes\\c2.mp4");
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\dines\\Downloads\\Komali\\c2copy.mp4");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		System.out.println("start");

		byte b[] = new byte[bis.available()];
		bis.read(b);


		bos.write(b);

		System.out.println("Success");
		bos.close();
		fos.close();
		bis.close();
		fis.close();

	}

}
