
public class bitwise_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=10;
          int b=11;
          int c=25;
          System.out.println("a&b is:"+(a&b));
          System.out.println("a|b is:"+(a|b));
          System.out.println("a^b is :"+(a^b));
          
          int crypt = (c<<2);
          System.out.println("c is crypted as:"+crypt);
          System.out.println("a<<2 is:"+(a<<2));
          System.out.println("a>>2 is:"+(a>>2));
          System.out.println("decrpt:"+(crypt>>2));
          
	}

}
