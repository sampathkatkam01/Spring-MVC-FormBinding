package in.sampath.entity;

public class Book {
	
	private String bookname;
	private Double bookprice;
	private String bookauthor;
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bookprice=" + bookprice + ", bookauthor=" + bookauthor + "]";
	}
	

}
