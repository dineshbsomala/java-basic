package exception;

class subop extends SubExcreate{
	public int sub(int x , int y) {
		if(x<0 || y>20) {
			throw new SubExcreate("One of the condition is false");
		}
		return y-x;
	}
}
public class SubtractExDemo {

	public static void main(String[] args) {


		subop subtrct = new subop();
		try {
			System.out.println(subtrct.sub(-2, 15));
		}catch(SubExcreate ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		finally {
			System.out.println("Exception is handled");
		}
		
		System.out.println("Learned Runtime exception|| Good job dinu");
	}

}
