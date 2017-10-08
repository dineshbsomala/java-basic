package iodemos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutDemo {

	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		String name = "dinesh dimple";
		
		try {
			fout = new FileOutputStream("C:\\Users\\dines\\Downloads\\Komali\\bufferout.txt");
			bout = new BufferedOutputStream(fout);
			byte b[] = name.getBytes();
			bout.write(b);
			System.out.println("Copied");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				bout.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
