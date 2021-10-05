import java.lang.*;
public class Book 
{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	public double price;
	public int availableQuantity;
	Book()
	{
	    System.out.println("Book class E-Construcor");
	}
	
	Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		System.out.println("Book class Parameterized-Constructor");
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
	public void setBookTitle (String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	
	
	public String getIsbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public double getPrice()
	{
		return price ;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	
	
	
    public void addQuantity(int amount)
	{
		this.availableQuantity= availableQuantity+amount;
	}
	public void sellQuantity(int amount)
	{
		this.availableQuantity= availableQuantity-amount;
	}
	public void showDetails()
	{
		System.out.println("--------------------------------------");
        System.out.println("Isbn: "+getIsbn());
        System.out.println("Title of book: "+getBookTitle());
        System.out.println("Name of Author: "+getAuthorName());
        System.out.println("Price of book: "+getPrice());
        System.out.println("Quantity available: "+getAvailableQuantity());
		System.out.println("---------------------------------------");
	}
	
	
}