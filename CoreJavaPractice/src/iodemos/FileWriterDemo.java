package iodemos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("E:\\core java raghu classes\\pwdemo.txt"));
		    pw.write("how are you??");
		    pw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("Done");
			
		}
		
		File fx = new File("E:\\core java raghu classes\\fileotherdemo.txt");
		
		fx.mkdirs();
		
		try {
			fx.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
