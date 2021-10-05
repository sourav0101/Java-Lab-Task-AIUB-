import java.lang.*;
public class Start {
public static void main(String[] args) 
{
  
        StoryBook b1 = new StoryBook();
		    StoryBook b2 = new StoryBook();
		    TextBook b3 = new TextBook();
        TextBook b4 = new TextBook();
	
		    b1.setIsbn("3-557-098-51");
        b1.setBookTitle("Tulanahina");
        b1.setAuthorName("Syed Mujtaba Ali");
        b1.setPrice(422);
        b1.setCategory("Novel");
        b1.setAvailableQuantity(200);
        b1.addQuantity(10);
        b1.sellQuantity(5);
        b1.showDetails();
        
        b2.setIsbn("566-37-88-14240-7");
        b2.setBookTitle("Himur Hate Koyekti Neel Poddo");
        b2.setAuthorName("Humayun Ahmed");
        b2.setPrice(500.88);
        b2.setCategory("Novel");
        b2.setAvailableQuantity(200);
        b2.addQuantity(50);
        b2.sellQuantity(40);
		
        System.out.println("ISBN:"+b1.getIsbn());
		    System.out.println("Book Title:"+b1.getBookTitle());
		    System.out.println("Author Name:"+b1.getAuthorName());
		    System.out.println("Price:"+b1.getPrice());
        System.out.println("Category:"+b1.getCategory());
		    System.out.println("Available Quantity:"+b1.getAvailableQuantity());
     
        b3 = new TextBook("1-127-546-6", "Panch Kanyar Panchali", "Bimal Mitra", 100, 60, 20);
        b3.addQuantity(50);
        b3.sellQuantity(40);
        b3.showDetails();
  
        b4.setIsbn("5-791-662-1");
        b4.setBookTitle("Bolo Ki Oporadh");
        b4.setAuthorName("Sheikh Abdul Hakim");
        b4.setPrice(200);
        b4.setAvailableQuantity(65);
        b4.setStandard(30);
        b4.addQuantity(80);
        b4.sellQuantity(30);
  
        System.out.println("ISBN:"+b4.getIsbn());
		    System.out.println("Book Title:"+b4.getBookTitle());
		    System.out.println("Author Name:"+b4.getAuthorName());
		    System.out.println("Price:"+b4.getPrice());
        System.out.println("Standard:"+b4.getStandard());
		    System.out.println("Available Quantity:" + b4.getAvailableQuantity());
    }
}
