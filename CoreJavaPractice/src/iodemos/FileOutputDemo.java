package iodemos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
	
		try {
			FileOutputStream fout = new FileOutputStream("E:\\core java raghu classes\\opdemo.txt");
		
			String name = "dinesh somala";
			byte str[] = name.getBytes();
			try {
				fout.write(str);
				System.out.println("success ");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
