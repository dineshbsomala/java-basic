package iodemos;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		
		PrintStream ps = new PrintStream(new FileOutputStream("E:\\core java raghu classes\\psdemo.txt"));
         String x = "Spyder";
		ps.println(x);
		ps.println(x+" will be blockbuster");
		ps.close();
	}

}
