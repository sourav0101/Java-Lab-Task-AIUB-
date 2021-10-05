import java.lang.*;
public class BookShop 
{
	
    public String name;
    public TextBook textBooks[] = new TextBook[100];
    public StoryBook storyBooks[] = new StoryBook[100];

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

	
	public boolean insertTextBook(TextBook tb) 
	{
       boolean flag = false;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                flag = true;
                break;
            }
        }
        return flag;
    }
	
	public boolean removeTextBook(TextBook tb) 
	{
        boolean flag = false;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == tb) {
                textBooks[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }


	public TextBook searchTextBook(String isbn) {
        TextBook tb = null;
    for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null) {
                if (textBooks[i].getIsbn() == isbn) {
                    tb = textBooks[i];
                    break;
                }
            }
        }
        return tb;
    }


	public void showAllTextBooks() 
	{ 
        for (int i = 0; i < textBooks.length; i++)
		{
            if (textBooks[i] != null) 
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
	
	public boolean insertStoryBook(StoryBook sb) {
        boolean flag = false;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                flag = true; break;
            }
        }
        return flag;
    }
	
    public boolean removeStoryBook(StoryBook sb) {
        boolean flag = false;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == sb) {
                storyBooks[i] = null;
                flag = true; break;
            }
        }
        return flag;
    }
	
	public StoryBook searchStoryBook(String isbn) {
        StoryBook sb = null;

        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null) {
                if (storyBooks[i].getIsbn() == isbn) {
                    sb = storyBooks[i];
                    break;
                }
            }
        }
        return sb;
    }
	
	public void showAllStoryBooks() 
	{ 
        for (int i = 0; i < storyBooks.length; i++)
		{
            if (storyBooks[i] != null) 
			{
        System.out.println("--------------------------------------");
        System.out.println("Isbn: "+storyBooks[i].getIsbn());
        System.out.println("Title of book: "+storyBooks[i].getBookTitle());
        System.out.println("Name of Author: "+storyBooks[i].getAuthorName());
        System.out.println("Price of book: "+storyBooks[i].getPrice());
        System.out.println("Quantity available: "+storyBooks[i].getAvailableQuantity());
		System.out.println("--------------------------------------");    
		   }
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}