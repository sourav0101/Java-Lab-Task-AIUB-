import java.lang.*;
public class StoryBook extends Book {
    String category;

    StoryBook() {
        System.out.println("StoryBook empty Constructor called");
    }
    StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
		System.out.println("StoryBook parameterized constructor Constructor called");
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    void showDetails() {
        super.showDetails();
        System.out.println("Category\t: " + category + "\n");
    }
}
