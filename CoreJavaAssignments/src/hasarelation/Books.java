package hasarelation;

public class Books {

	
	private String bname;
	private int bid;
	private String author;
	public Books(String bname, int i, String author) {
		super();
		this.bname = bname;
		this.bid = i;
		this.author = author;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showdetails() {
		System.out.println("Book name: "+bname);
		System.out.println("book id: "+bid);
		System.out.println("AUthor: "+author);
	}
	
}
