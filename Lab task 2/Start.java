import java.lang.*;
public class Start
{
  public static void main (String [] args )
  {
    Book b= new Book();
    Book b1= new Book();
	
	b.setisbn("978-3-16-148410-0");
	b.setBookTitle("Meku Kahini");
	b.setAuthorName("Muhammed Zafar Iqbal");
	b.setPrice(370);	
	
	System.out.println("Isbn:"+b.getisbn()); 
	System.out.println("Book title:"+b.getBookTitle()); 
	System.out.println("Book author name:"+b.getAuthorName());
	System.out.println("Book price(Tk):"+b.getPrice());
	
	b.setAvailableQuantity(21); //AvailableQuantity 
	System.out.println("AvailableQuantity:"+b.getAvailableQuantity()); 
	b.addQuantity(55);          //addQuantity
	System.out.println("AvailableQuantity[add quantity method call]:"+b.getAvailableQuantity()); 
	b.sellQuantity(5);          //Sell Quantity
	System.out.println("AvailableQuantity[sell quantity method call]:"+b.getAvailableQuantity());
	
	System.out.println("-----------------------------");
	System.out.println("Calling showDetails() Method: ");
	System.out.println("-----------------------------");
	
	b1.setisbn("523-3-16-142310-1");
	b1.setBookTitle("Shantar Poribar");
	b1.setAuthorName("Mohammad Jafar Iqbal");
	b1.setPrice(250);
	b1.setAvailableQuantity(43); 
	b1.showDetails();
  }
 }
