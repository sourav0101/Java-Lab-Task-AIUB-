import java.lang.*;
public class BookShop implements BookShopOperations
{
	private String name;
	private Book books[] = new Book[100];
	public void setBookShopName(String name){
		this.name = name;
	}
	public String getBookShopName()
	{
		return this.name;
	}
	
	BookShop(){ }
	
	BookShop(String name){
		this.name = name;
	}
	
	
	
	public boolean insertBook(Book boo){
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = boo;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeBook(Book boo){
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == boo){ books[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
		
	public Book searchBook(String isbn){
		Book boo = null;
		for(int i =0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getIsbn() == isbn)
				{
					boo = books[i];
					break;
				}
			}
		}
		return boo;
	}
	
	public void showAllBooks(){
		for(int i=0;i<books.length;i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
				books[i].addQuantity(20);
				books[i].sellQuantity(9);
				System.out.println("\n");
			}
		}
	}
}