package exception;

public class MultiCatch {
	public static void main(String[] args)  {
		try {
			int value = m1(5,0);
			int arr[] = {1,2,3,4}; 
			System.out.println("value : "+value);

			System.out.println(arr[2]);

		}catch(ArithmeticException ex) {
			System.out.println("Division result unidentified");
		}catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println("Array is out of bound");
		}finally {
			System.out.println("This will be executed anyways");
		}

	}

	private static int m1(int i, int j) throws ArithmeticException{

		int res = m2(i,j);
		return res;

	}

	private static int m2(int x, int y) throws ArithmeticException {

		int result = x/y;
		return result;

	}
}
