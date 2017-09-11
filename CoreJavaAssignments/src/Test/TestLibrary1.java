package Test;

import hasarelation.Books;
import hasarelation.Library1;

public class TestLibrary1 {

	public static void main(String[] args) {

	Books buk = new Books("Science of Sex", 12, "Raghu Varma");
	Library1 testbook = new Library1();
	testbook.setBooks(buk);
	
testbook.getBooks().showdetails();
	}

}
