import java.lang.*; 
public class Start{
	public static void main(String args[])
	{
		StoryBook s = new StoryBook(); 
		StoryBook s2 = new StoryBook();
		TextBook t = new TextBook(); 
		TextBook t1 = new TextBook();
		
		s.setIsbn("978-3-16-148410-0"); 
		s.setBookTitle("Ami Topu"); 
		s.setAuthorName("Muhammed Zafar Iqbal"); 
	    s.setPrice(231.99); 
	    s.setAvailableQuantity(3);
	    s.setCategory("Friction"); 
		s.setDiscountRate(15.5);
		
		System.out.println("ISBN: "+s.getIsbn()); 
		System.out.println("BookTitle: "+s.getBookTitle()); 
		System.out.println("AuthorName: "+s.getAuthorName()); 
	    System.out.println("Price: "+s.getPrice()); 
	    System.out.println("AvaiableQuantity: "+s.getAvailableQuantity());
	    System.out.println("Category: "+s.getCategory()); 
		System.out.println("DiscountRate:"+s.getDiscountRate()+"%"); 
		
		
		s.setAvailableQuantity(21); //AvailableQuantity 
	    System.out.println("AvailableQuantity:"+s.getAvailableQuantity()); 
	    s.addQuantity(59);          //addQuantity
	    System.out.println("AvailableQuantity[add quantity method call]:"+s.getAvailableQuantity()); 
	    s.sellQuantity(9);          //Sell Quantity
	    System.out.println("AvailableQuantity[sell quantity method call]:"+s.getAvailableQuantity());
		
		System.out.println("--------------------------------------");
		s.showDetails(); 
		System.out.println("--------------------------------------");
		
		
		t.setIsbn("566-37-88-14240-7"); 
		t.setBookTitle("Himur Hate Koyekti Neel Poddo"); 
		t.setAuthorName("Humayun Ahmed"); 
	    t.setPrice(500.88); 
	    t.setAvaiableQuantity(36);
	    t.setStandard(2);
		t.setDiscountRate(20.5);
		
		
		System.out.println("ISBN: "+t.getIsbn()); 
		System.out.println("BookTitle: "+t.getBookTitle()); 
		System.out.println("AuthorName: "+t.getAuthorName()); 
	    System.out.println("Price: "+t.getPrice()); 
	    System.out.println("AvaiableQuantity: "+t.getAvailableQuantity());
		
	    System.out.println("Standard: "+t.getStandard());	
		System.out.println("DiscountRate: "+t.getDiscountRate()+"%"); 
		
		t.setAvaiableQuantity(65); 
	    System.out.println("AvailableQuantity:"+t.getAvailableQuantity()); 
	    t.addQuantity(77);          
	    System.out.println("AvailableQuantity[add quantity method call]:"+t.getAvailableQuantity()); 
	    t.sellQuantity(2);          
	    System.out.println("AvailableQuantity[sell quantity method call]:"+t.getAvailableQuantity());
		
		System.out.println("---------------- t.showDetails() ----------------------");
		t.showDetails();
		//System.out.println("--------------------------------------");
	

	}
}
