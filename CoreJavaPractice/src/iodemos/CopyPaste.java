package iodemos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste  {

	public static void main(String[] args) throws Exception {

		FileInputStream copy = new FileInputStream("E:\\core java raghu classes\\Collections.pptx");

		FileOutputStream paste = new FileOutputStream("E:\\core java raghu classes\\CollectionsCopy2.pptx");

		/*int data = copy.read();

		while(data != -1) {
		 //System.out.println((char)data);
			paste.write(data);
			data = copy.read();
		}*/
		
		byte copied[] = new byte[copy.available()]; 
		copy.read(copied);
		paste.write(copied);
		System.out.println("Success");
		
		copy.close();
		paste.close();
	}

}
