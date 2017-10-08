package iodemos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//import javax.imageio.stream.FileImageInputStream;

public class BufferInDemo {

	public static void main(String[] args) {

		FileInputStream fimg = null;
		BufferedInputStream bimg = null;
		try {
			fimg = new FileInputStream("E:\\core java raghu classes\\ionotes.txt");
			bimg = new BufferedInputStream(fimg);
			byte b[] = new byte[bimg.available()];
			bimg.read(b);
			for(byte i:b) {
				char c = (char)i;
				System.out.print(c); 
			}
			
			/*int c = bimg.read();
			while(c != -1) {
				System.out.print((char)c);
				c = bimg.read();
			}*/
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally{

			try {
				bimg.close();
				fimg.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

}
