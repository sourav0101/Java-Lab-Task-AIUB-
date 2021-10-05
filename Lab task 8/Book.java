import java.lang.*;
public abstract class Book implements BookOperations
{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int availableQuantity;
	
	public Book()
	{ 
	     System.out.println("Empty-constractor Book");
	}
	
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Parameterized -constractor Book");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	public void setIsbn(String isbn)
	{ 
	    this.isbn=isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvailableQuantity(int avaialbleQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public String getIsbn(){return isbn;}
	public String getBookTitle() {return bookTitle;}
	public String getAuthorName(){return authorName;}
	public double getPrice(){return price;}
	public int getAvailableQuantity(){return availableQuantity;}
		
	public void addQuantity(int amount) { availableQuantity+= amount;}
	public void sellQuantity(int amount) {availableQuantity-= amount;}	
			
	public abstract void showDetails();
}	
		

