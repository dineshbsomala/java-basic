package serializationdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class RoboSerialization implements Serializable {

	public static void main(String[] args) {

		try {
			serialization();
			System.out.println("Serialization complete");
			
			System.out.println("de-serialization start");
			deserialization();
			System.out.println("De-serialization complete");
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

	}

	private static void deserialization() throws Exception{
		FileInputStream fis = new FileInputStream("E:\\Java Raghu Classes\\serialzationdemo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		if(obj instanceof Robo) {
			System.out.println(obj);
		}
		ois.close();
		
	}

	private static void serialization() throws Exception {

		FileOutputStream fout = new FileOutputStream(new File("E:\\Java Raghu Classes\\serialzationdemo.txt"));

		ObjectOutputStream oot = new ObjectOutputStream(fout);

		Robo chitti = new Robo("chitti", 2223);

		oot.writeObject(chitti);
		oot.close();

	}

}
