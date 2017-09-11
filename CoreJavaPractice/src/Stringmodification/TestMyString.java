package Stringmodification;

public class TestMyString {
	public static void main(String[] args) {

		String str1 = new String("dinu");
		String str2 = new String("dinu");
		
		if(str1.equals(str2)) {
			System.out.println("The Strings str1 and str2 are equal");
		}
		else {
			System.out.println("Strings str1 and str2 are not equal");
		}
		
		MyString my1 = new MyString("dinu", 2);
		MyString my2 = new MyString("dinu", 3);
		
		if(my1.equals(my2)) {
			System.out.println("The Strings my1 and my2 are equal");
		}
		else {
			System.out.println("The Strings my1 and my2 are not equal");
		}
		
		System.out.println(my1.hashCode());
		System.out.println(my2.hashCode());
		System.out.println();
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
