import java.lang.*; 
public class TextBook 
{
	private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int standard;
    private static double discountRate; 
	


    TextBook()
	{
		System.out.println("Constructor"); 
	}
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,int standard)
	{
		this.isbn = isbn; 
		this.bookTitle = bookTitle; 
		this.authorName = authorName; 
		this.price = price; 
		this.availableQuantity = availableQuantity; 
		this.standard = standard; 
	}
    public static void setDiscountRate(double rate)
	{
		TextBook.discountRate = rate; 
	}
	public  static double getDiscountRate()
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
    public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity; 
	}
    public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	
	
    public String getIsbn()
	{
		return isbn;
	}
	public double getPrice()
	{
		return price;
	}
    public int getAvailableQuantity()
	{
		return availableQuantity;
	}
    public int getStandard()
	{
		return standard; 
	}
    public String getBookTitle()
	{
		return bookTitle;
	}
    public String getAuthorName()
    {
		return authorName; 
    }
    //public static double getDiscountRate()
    //{
	//	return discountRate;
	//}
	
    
	

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
		System.out.println("AvailableQuantity: "+availableQuantity);
		//System.out.println("category: "+category);	
		System.out.println("Standard: "+standard);
		System.out.println("Discount Rate:" +discountRate +"%");	
		
	}
		
}
