package SecondAssignmnet;

public class Books {

	private int bid;
	private String bname;
	private String author;
	public Books(int bid, String bname, String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showdetails() {
		System.out.println("Book name: "+bname);
		System.out.println("Bookd id: "+bid);
		System.out.println("Book author: "+author);
	}
}
