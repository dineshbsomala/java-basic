package iodemos;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {


		DataInputStream dis1 = new DataInputStream(System.in);

		System.out.println("Enter age: ");

		@SuppressWarnings("deprecation")
		String age = dis1.readLine();
		
		System.out.println("Enter number");
		int ageq = dis1.readInt();
		
		System.out.println(age);
		System.out.println(ageq);


		DataOutputStream dout = new DataOutputStream(new FileOutputStream("E:\\core java raghu classes\\dtotpstrm.txt"));
		DataOutputStream dout1 = new DataOutputStream(System.out);

		dout.writeChars(age);
		dout1.writeInt(ageq);
		dout.close();

		dis1.close();

	}

}
