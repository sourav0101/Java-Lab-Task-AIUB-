import java.lang.*;
public class TextBook extends Book
{
	public int standard;
	TextBook ()
	{
		System.out.println("TextBook class E-Construcor");
	}
	
	TextBook (String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		System.out.println("TextBook class Parameterized-Constructor");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.standard = standard;
	}
	public void seStandart(int standard)
	{
		this.standard=standard;
	}
	public int getStandard()
	{
		return standard;
	}
	
}