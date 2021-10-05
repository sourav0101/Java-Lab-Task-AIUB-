import java.lang.*;
public class StoryBook extends Book
{
	public String Category;
	StoryBook ()
	{
	   System.out.println("StoryBook class E-Construcor");
	}
	
	StoryBook (String isbn, String bookTitle, String authorName, double price, int availableQuantity, String Category)
	{
		System.out.println("StoryBook class Parameterized-Constructor");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.Category = Category;
	}
	
	public void setCategory(String Category)
	{
		this.Category = Category;
	}
	public String getCategory()
	{
		return Category;
	}
	
}