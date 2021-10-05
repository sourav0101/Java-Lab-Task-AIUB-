import java.lang.*;
public class TextBook extends Book
{
	private int standard;
	public TextBook()
	{
		super();
		System.out.println("Empty-constractor Text Book");
	}
	
	public TextBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, avaiableQuantity);
		System.out.println("Parameterized-constractor Text Book");
		this.standard = standard;
	}
	
	public void setStandard(int standard) {	this.standard = standard;}
	public int getStandard(){return standard;}
	
	
	public	void showDetails()
	{	
		//System.out.println("---------------------------------------");
        System.out.println("Isbn: "+getIsbn());
        System.out.println("Title of book: "+getBookTitle());
        System.out.println("Name of Author: "+getAuthorName());
        System.out.println("Price of book: "+getPrice());
        System.out.println("Quantity available: "+getAvailableQuantity());
		System.out.println("Standard: "+ standard);
		//System.out.println("--------------------------------------");
	}
	
	
}