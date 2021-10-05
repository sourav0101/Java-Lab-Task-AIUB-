import java.lang.*;
public class Start{
	public static void main(String [] args){
		/*
		 create Five objects of StoryBook, Five objects of 
		 TextBook and One object of BookShop
		*/
		
		TextBook textt1 = new TextBook();
		TextBook textt2, textt3, textt4, textt5;
		
		textt1.setIsbn("374-1-55-098422-51");
		textt1.setBookTitle("Principles of Compiler Design");
		textt1.setAuthorName("Alfred Aho");
		textt1.setPrice(900.0);
		textt1.setAvailableQuantity(33);
		textt1.setStandard(6);
		
		
		textt2 = new TextBook("933-4-16-643664-6","Algorithm Design","Robert Sedgewick",2500.0,20,5);
		textt3 = new TextBook("512-7-96-598214-3","Theory of computation","Michael Sipser",396.0,25,6);
		textt4 = new TextBook("458-6-33-654356-7","Game Programming Patterns","Bob Nystrom",500.0,36,7);
		textt5 = new TextBook("111-3-19-193764-0","Software Engineering","Roger S. Pressman",900.0,96,8);
		System.out.println("------------------------");
		
		
		StoryBook storyy1 = new StoryBook();
		StoryBook storyy2, storyy3, storyy4, storyy5;
		
		storyy1.setIsbn("159-0-18-716996-8");
		storyy1.setBookTitle("Deyal");
		storyy1.setAuthorName("Humayun Ahmed");
		storyy1.setPrice(800);
		storyy1.setAvailableQuantity(30);
		storyy1.setCategory("Novel");
		
		
		storyy2 = new StoryBook("879-5-15-398400-1","Aaj Chitrar Biye","Humayun Ahmed",100.0,10,"Fiction");
		storyy3 = new StoryBook("100-9-88-446757-5","Dorjar Opashe","Humayun Ahmed",233.2,20,"Fiction");
		storyy4 = new StoryBook("821-8-50-654111-4","Kathpencil","Humayun Ahmed",205,36,"Fiction");
		storyy5 = new StoryBook("963-1-01-752148-9","Himur Rupali Ratri","Humayun Ahmed",155.9,39,"Fiction");
	
		BookShop Bsob = new BookShop("Onkur Book Shop");
		
		System.out.println("--------- Insert Text Books-----------");
		
		if(Bsob.insertBook(textt1)){
			System.out.println(textt1.getIsbn() + " Inserted -> " + textt1.getBookTitle());
		}
		else{
			System.out.println(textt1.getIsbn() + " Not inserted -> " + textt1.getBookTitle());
		}
		
		if(Bsob.insertBook(textt2)){
			System.out.println(textt2.getIsbn() + " Inserted -> "+ textt2.getBookTitle());
		}
		else{
			System.out.println(textt2.getIsbn() + " Not Inserted -> "+ textt2.getBookTitle());
		}
		
		if(Bsob.insertBook(textt3)){
			System.out.println(textt3.getIsbn() + " Inserted ->"+ textt3.getBookTitle());
		}
		else{
			System.out.println(textt3.getIsbn() + " Not Inserted ->"+ textt3.getBookTitle());
		}
		
		if(Bsob.insertBook(textt4)){
			System.out.println(textt4.getIsbn() + " Inserted -> "+ textt4.getBookTitle());
		}
		else{
			System.out.println(textt4.getIsbn() + " Not Inserted -> "+ textt4.getBookTitle());
		}
		
		if(Bsob.insertBook(textt5)){
			System.out.println(textt5.getIsbn() + " Inserted ->"+ textt5.getBookTitle());
		}
		else{
			System.out.println(textt5.getIsbn() + " Not Inserted -> "+ textt5.getBookTitle());
		}
		
		
		
		
		System.out.println("--------- Insert Story Books-----------------\n");
		
		if(Bsob.insertBook(storyy1)){
			System.out.println(storyy1.getIsbn() + " Inserted -> " + storyy1.getBookTitle());
		}
		else{
			System.out.println(storyy1.getIsbn() + " Not inserted -> " + storyy1.getBookTitle());
		}
		
		if(Bsob.insertBook(storyy2)){
			System.out.println(storyy2.getIsbn() + " Inserted -> "+ storyy2.getBookTitle());
		}
		else{
			System.out.println(storyy2.getIsbn() + " Not Inserted -> "+ storyy2.getBookTitle());
		}
		
		if(Bsob.insertBook(storyy3)){
			System.out.println(storyy3.getIsbn() + " Inserted ->"+ storyy3.getBookTitle());
		}
		else{
			System.out.println(storyy3.getIsbn() + " Not Inserted -> "+ storyy3.getBookTitle());
		}
		
		if(Bsob.insertBook(storyy4)){
			System.out.println(storyy4.getIsbn() + " Inserted -> "+ storyy4.getBookTitle());
		}
		else{
			System.out.println(storyy4.getIsbn() + " Not Inserted -> "+ storyy4.getBookTitle());
		}
		
		if(Bsob.insertBook(storyy5)){
			System.out.println(storyy5.getIsbn() + " Inserted -> "+ storyy5.getBookTitle());
		}
		else{
			System.out.println(storyy5.getIsbn() + " Not Inserted -> "+ storyy5.getBookTitle());
		}
		
		//System.out.println("--------------------------------------\n");
		
		
		
		
		
		System.out.println("\n-------------- Our inserted BookShop Books list -----------\n");
		Bsob.showAllBooks();
		//System.out.println("--------------------------------------\n");
		
		//
		System.out.println("-------------- Remove Text Books -----------------\n");
		if(Bsob.removeBook(textt2)){
			System.out.println(textt2.getIsbn() + " Removed ! ");
		}
		else{
			System.out.println(textt2.getIsbn() + " Not Removed !");
		}
		
		if(Bsob.removeBook(textt3)){
			System.out.println(textt3.getIsbn() + " Removed ! ");
		}
		else{
			System.out.println(textt3.getIsbn() + " Not Removed ! ");
		}
		
		//
		System.out.println("--------------Remove Story Books-----------------\n");
		
		if(Bsob.removeBook(storyy1)){
			System.out.println(storyy1.getIsbn() + " Removed ! ");
		}
		else{
			System.out.println(storyy1.getIsbn() + " Not Removed !");
		}
		
		if(Bsob.removeBook(storyy4)){
			System.out.println(storyy4.getIsbn() + " Removed ! ");
		}
		else{
			System.out.println(storyy4.getIsbn() + " Not Removed !");
		}
		
		System.out.println("--------------------------------------\n");
		
		System.out.println("\n--------------- Remaining BookShop Books --------------\n");
		Bsob.showAllBooks();
		//System.out.println("--------------------------------------\n");
		
		///Searching for Books 
		System.out.println("\n--------------- Searching BookShop Books --------------\n");
		Book txtb = Bsob.searchBook(textt4.getIsbn());
		if(txtb != null){
			System.out.println("(Text Book Found of Isbn): -> "+ textt4.getIsbn());
			txtb.showDetails();
		}
		else{
			System.out.println("No Book Found of Isbn : " + textt4.getIsbn());
		}
		System.out.println("\n--------------------------------------\n");
		
		Book s = Bsob.searchBook(storyy2.getIsbn());
		if(s != null){
			System.out.println("(Story Book Found of Isbn): -> "+ storyy2.getIsbn());
			s.showDetails();
		}
		else{
			System.out.println("No Book Found of Isbn: " + storyy2.getIsbn());
		}
	}
}
