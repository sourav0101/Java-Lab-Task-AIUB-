import java.lang.*;
public class Book
{
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
 
 public Book()
 {
     System.out.println ("Constructor has been called!");
 }
 public Book(String isbn, String bookTitle, String authorName, double price,int availableQuantity)
 {
	 System.out.println("Parameterized-Book");
	 this.isbn = isbn; 
	 this.bookTitle = bookTitle; 
	 this.authorName = authorName; 
	 this.price = price; 
	 this.availableQuantity = availableQuantity; 
 }
 
  public void setBookTitle(String bookTitle)
  {
     this.bookTitle = bookTitle;
  }
  public void setAuthorName(String authorName)
  {
    this.authorName = authorName;
  }
  public void setisbn(String isbn)
  {
    this.isbn = isbn;
  }
  public void setPrice(double price)
  {
    this.price = price;
  }
  public void setAvailableQuantity (int availableQuantity)
  {
	this.availableQuantity = availableQuantity;
  }
  
  
  public String getisbn()
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
    return price;
  }
  public int getAvailableQuantity()
  {
	  return availableQuantity;
  }
  
  public void addQuantity(int amount)
  {
	  if (amount>0){
			availableQuantity = availableQuantity+amount; 
			//System.out.println("Done"); 
	    }
		else {
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
	System.out.println("Isbn is : " +getisbn() );
	System.out.println("The title of the book: " +getBookTitle() );
	System.out.println("Author Name is : " +getAuthorName() );
	System.out.println("Book's Price is (Tk): " +getPrice() );
	System.out.println("AvailableQuantity is :"+getAvailableQuantity() );
  }
}






