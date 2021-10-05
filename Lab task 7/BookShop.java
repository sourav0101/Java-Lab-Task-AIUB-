import java.lang.*;
public class BookShop 
{
	
    public String name;
    public Book books[] = new Book[100];
    //public StoryBook storyBooks[] = new StoryBook[100];

   BookShop()
   { 
       System.out.println("BookShop class E-Construcor");
   }
   
   BookShop(String name)
   {
	   System.out.println("BookShop class Parameterized-Constructor");
	   this.name = name;
   }
   
   
   public void setName(String name)
   {
	   this.name = name;
   }
   public String getName()
   {
	   return name;
   }

	
	public boolean insertBook(Book b) 
	{
       boolean flag = false;
        for (int i = 0; i <Books.length; i++) {
            if (Books[i] == null) {
                Books[i] = b;
                flag = true;
                break;
            }
        }
        return flag;
    }
	

	public boolean removeBook(Book b) 
	{
        boolean flag = false;
        for (int i = 0; i <Books.length; i++) {
            if (Books[i] == tb) {
                Books[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }


	public void showAllBooks() 
	{ 
        for (int i = 0; i <Books.length; i++)
		{
            if (Books[i] != null) 
			{
        System.out.println("---------------------------------------");
        System.out.println("Isbn: "+textBooks[i].getIsbn());
        System.out.println("Title of book: "+textBooks[i].getBookTitle());
        System.out.println("Name of Author: "+textBooks[i].getAuthorName());
        System.out.println("Price of book: "+textBooks[i].getPrice());
        System.out.println("Quantity available: "+textBooks[i].getAvailableQuantity());
		System.out.println("--------------------------------------");    
		   }
        }
    }
	
	
	
	public Book searchBook(String isbn) {
        Book b = null;

        for (int i = 0; i < Books.length; i++) {
            if (Books[i] != null) {
                if (Books[i].getIsbn() == isbn) {
                    b = Books[i];
                    break;
                }
            }
        }
        return b;
    }
	
	
	
	

	
	
}