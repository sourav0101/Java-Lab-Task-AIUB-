import java.lang.*;
public class StoryBook extends Book
{
	private String category;
	
	public StoryBook()
	{
		super();
		System.out.println("Empty-constractor Story Book");
	}
	
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, String category)
	{
		super(isbn, bookTitle, authorName, price, avaiableQuantity);
		System.out.println("Parameterized-constractor Story Book");
		this.category = category;
	}
	
	public void setCategory(String category){ this.category = category;}
	public String getCategory() {return category;}
	
	
	
	public	void showDetails()
	{	
		//System.out.println("----------------StoryBooks-----------------------");
        System.out.println("Isbn: "+getIsbn());
        System.out.println("Title of book: "+getBookTitle());
        System.out.println("Name of Author: "+getAuthorName());
        System.out.println("Price of book: "+getPrice());
        System.out.println("Quantity available: "+getAvailableQuantity());
		System.out.println("Category: "+ category);
		//System.out.println("--------------------------------------");
	}
	
}
	