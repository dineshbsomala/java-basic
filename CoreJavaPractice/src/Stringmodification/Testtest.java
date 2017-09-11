package Stringmodification;

public class Testtest {

	public static void main(String[] args) {
		
		tests t1 = new tests(2, "bio");
		tests t2 = new tests(2, "bio");
		
		if(t1.getBook().equals(t2.getBook())) {
			System.out.println("equal");
			
		}
		else {
			System.out.println("not equal");
		}

	}

}
