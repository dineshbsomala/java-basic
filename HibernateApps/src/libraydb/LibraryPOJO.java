package libraydb;

public class LibraryPOJO {

	private int bid;
	private String stream;
	private String bookname;
	private int copies;
	public LibraryPOJO() {
		super();
	}
	public LibraryPOJO(int bid, String stream, String bookname, int copies) {
		super();
		this.bid = bid;
		this.stream = stream;
		this.bookname = bookname;
		this.copies = copies;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
}
