import java.lang.*; 
public class StoryBook
{
	private String isbn; 
	private String bookTitle; 
	private String authorName; 
	private double price; 
	private int availableQuantity;
	private String category; 
	private static double discountRate;
	
	
	StoryBook()
	{
		System.out.println("Constructor"); 
	}
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName; 	
		this.price = price; 
		this.availableQuantity = availableQuantity; 
		this.isbn = isbn; 	
	}
	
	public static void setDiscountRate(double rate)
	{
		StoryBook.discountRate = rate; 
	}
	public static double getDiscountRate()
    {
		return discountRate;
	}
	
	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn; 
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
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity; 
	}
	public void setCategory(String isbn)
	{
		this.category = isbn; 
	}
	
	
	
	public String getIsbn() { return isbn; }
	public String getBookTitle() {return bookTitle; }
	public String getAuthorName() {return authorName;}
	public double getPrice() {return price;}
	public int getAvailableQuantity(){return availableQuantity;}
	public String getCategory(){return category;} 
	
	
	public void addQuantity(int amount)
	{
		if (amount>0){
			availableQuantity = availableQuantity+amount; 
			//System.out.println("Done"); 
	    }else {
		    System.out.println("Invalid"); 
	      }
	}
	
    public void sellQuantity(int amount)
    {
	    if(amount>0 && amount<=availableQuantity)
	   {
		availableQuantity = availableQuantity - amount;
		//System.out.println("Done");
	   }
	 else
	 {
		System.out.println("Invalid");
	 }
   }
   
	public void showDetails()
	{
		System.out.println("Isbn: "+isbn); 
		System.out.println("BookTitle: "+bookTitle);
		System.out.println("AuthorName: "+authorName);
		System.out.println("Price: "+price);
		System.out.println("Available Quantity:" + availableQuantity); 
		System.out.println("Category: "+category);	
        System.out.println("Discount Rate:" + discountRate +"%");	
        //addQuantity
 		//sellQuantity 
		
	}


	
	
	
	
	
} 