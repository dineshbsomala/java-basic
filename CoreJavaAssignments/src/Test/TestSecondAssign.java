package Test;

import SecondAssignmnet.Books;
import SecondAssignmnet.Library;

public class TestSecondAssign {

	public static void main(String[] args) {
		
		Books[] buks = new Books[2];
		buks[0] = new Books(12, "Astrology", "varma");
		buks[1] = new Books(13, "physics", "mounica");
		//buks[2] = new Books(2, "bible", "sanvi joseph");
		
		Library lib = new Library();
		lib.setBuks(buks);
		for(int i=0; i<buks.length; i++) {
			buks[i].showdetails();
			System.out.println();
		}
	}

}
