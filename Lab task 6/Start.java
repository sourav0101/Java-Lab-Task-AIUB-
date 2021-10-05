import java.lang.*;
public class Start
{
    public static void main(String[] args) {

    TextBook text1 = new TextBook("933-4-16-643664-6", "Philosophy 1", "Aristotle", 400.9, 20, 5);
    TextBook text2 = new TextBook("512-7-96-598214-3", "Philosophy 2", "Aristotle", 500.7, 16, 6);
    TextBook text3 = new TextBook("458-6-33-654356-7", "Philosophy 3", "Aristotle", 900.3, 80, 7);
    TextBook text4 = new TextBook("111-3-19-193764-0", "Philosophy 4", "Aristotle", 450.1, 33, 8);
    TextBook text5 = new TextBook("879-5-15-398400-1", "Philosophy 5", "Aristotle", 700.8, 55, 9);
	
    StoryBook story1 = new StoryBook ("159-0-18-716996-8", "Tin Goyenda part 1","Rakib Hasan", 100, 99,"Detective novels");
    StoryBook story2 = new StoryBook ("100-9-88-446757-5", "Tin Goyenda part 2","Rakib Hasan", 200, 12,"Detective novels");
    StoryBook story3 = new StoryBook ("821-8-50-654111-4", "Tin Goyenda part 3","Rakib Hasan", 105, 37,"Detective novels");
    StoryBook story4 = new StoryBook ("963-1-01-752148-9", "Tin Goyenda part 4","Rakib Hasan", 200, 78,"Detective novels");
    StoryBook story5 = new StoryBook ("651-6-77-945132-3", "Tin Goyenda part 5","Rakib Hasan", 630, 25,"Detective novels");

    BookShop bookS= new BookShop("Avid readers collection");
    bookS.insertTextBook(text1);
    bookS.insertTextBook(text2);
    bookS.insertTextBook(text3);
    bookS.insertTextBook(text4);
    bookS.insertTextBook(text5);
    bookS.removeTextBook(text5);

    TextBook tx = bookS.searchTextBook("100-9-88-446757-5");
    if(tx!=null)
    {
	      System.out.println("Text Book has been found!");
        System.out.println("Isbn: "+tx.getIsbn());
        System.out.println("Title of book: "+tx.getBookTitle());
        System.out.println("Name of Author: "+tx.getAuthorName());
        System.out.println("Price of book: "+tx.getPrice());
        System.out.println("Quantity available: "+tx.getAvailableQuantity());
		    //System.out.println("-----------------------------------");
    }
    System.out.println("\nAll Text Books print:\n---------------------\n");
    bookS.showAllTextBooks(); 
    bookS.insertStoryBook(story1);
    bookS.insertStoryBook(story2);
    bookS.insertStoryBook(story3);
    bookS.insertStoryBook(story4);
    bookS.insertStoryBook(story5);
    bookS.removeStoryBook(story4);

    StoryBook sx = bookS.searchStoryBook("821-8-50-654111-4");
    if(sx!=null)
    {
     System.out.println("Story Book FOUND\n");
     System.out.println("Isbn: "+sx.getIsbn());
     System.out.println("Title of book: "+sx.getBookTitle());
     System.out.println("Name of Author: "+sx.getAuthorName());
     System.out.println("Price of book: "+sx.getPrice());
     System.out.println("Quantity available: "+sx.getAvailableQuantity());
	   System.out.println("------------------------------------------");
    }
    System.out.println("All Story Books\n---------\n");
    bookS.showAllStoryBooks(); 
  }
}
