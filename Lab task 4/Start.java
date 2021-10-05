import java.lang.*; 
public class Start
{
    public static void main(String args[])
    {
      /**
          Create an array of the Book class. Assign objects
          of the Book class in the array and
          print the values of the objects from the array.
      **/
	Book b = new Book();
        b.setIsbn("3-557-098-51");
        b.setBookTitle("Tulanahina");
        b.setAuthorName("Syed Mujtaba Ali");
        b.setPrice(422);
        b.setAvailableQuantity(42);
        b.addQuantity(67);
        b.sellQuantity(9);

        Book b1 = new Book("1-127-546-6 ","Maitreya Jataka","Bani Basu",360.8,74);
        b1.sellQuantity(50);
        b1.addQuantity(70);

        Book b2 = new Book("8-453-804-3", "Panch Kanyar Panchali","Bimal Mitra",122.14, 423);
        b2.sellQuantity(50);
        b2.addQuantity(200);

        Book b3 = new Book("5-791-662-1","Bolo Ki Oporadh","Sheikh Abdul Hakim",321.4,64);
        b3.sellQuantity(200);
        b3.addQuantity(50);

        Book b4 = new Book("4-405-644-2","Matal Toroni","Humayun Azad",450.9, 132);
        b4.sellQuantity(700);
        b4.addQuantity(500);

        Book ar[] = new Book [5];
        ar[0] = b; ar[1] = b1; ar[2] = b2; ar[3] = b3; ar[4] = b4;
		
        for(int i=0; i<ar.length; i=i+1){
            ar[i].showDetails();
            System.out.println("-----------------");
        }
		
    }
}



