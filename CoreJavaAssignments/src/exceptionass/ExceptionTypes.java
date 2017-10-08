package exceptionass;

public class ExceptionTypes{

	public static void main(String[] args) {
		arrayoutofboundexception();
		nullpointerexception();

	}

	private static void nullpointerexception() {
		String ename = null;
		try {
			if(ename.equals("dinu")) {
				System.out.println("Names match");
			}
			else {
				System.out.println("do not match");
			}
		}catch(NullPointerException e) {
			System.out.println("Null pointer exception caught");
		}
		
	}

	public static void arrayoutofboundexception(){
		try {
			double name[] = {1.2,2.3,4.5};
			System.out.println(name[5]);

		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("no value in specified array");
		}
	}

}
