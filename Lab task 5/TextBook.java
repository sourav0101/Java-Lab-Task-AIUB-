import java.lang.*;
public class TextBook extends Book {
    int standard;

    TextBook() {
        System.out.println("TextBook empty Constructor called");
    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
		System.out.println("TextBook parameterized Constructor called");
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    public int getStandard() {
        return standard;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Standard\t: " + standard + "\n");   
    }
}