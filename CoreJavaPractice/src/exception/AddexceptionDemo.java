package exception;

@SuppressWarnings("serial")
class Addop extends AdditionException{
	public int Add(int a , int b) throws AdditionException  {

		if(a<0 || b<0) {
			throw new AdditionException("Negative numbers initialized");
		}

		return a+b;

	}
}

public class AddexceptionDemo {

	public static void main(String[] args) {
		
		Addop sum = new Addop();
		try {
			System.out.println("result is: "+sum.Add(-2, 3));
		} catch (AdditionException e) {
			
			e.printStackTrace();
		}

	}
}
