import java.util.Scanner;

class datatypes_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 32.33f;
		double d = 233.2321;
		boolean b = true;
		char ch = 'd';
		System.out.println("float value is:"+f);
		System.out.println("double value is:"+d);
		System.out.println("boolean value:"+b);
		System.out.println("character is:"+ch);
		System.out.println("enter person age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>18)
		{
			System.out.println("person is eligible to drive");
		}
		else
			System.out.println("cannot drive");
		sc.close();
	}
	

}
