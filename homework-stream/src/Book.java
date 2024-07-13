import java.util.ArrayList;
import java.util.List;


public class Book {
    private String author;
    private String title;
    private double price;
    private List<String> reviews;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    // Геттеры и сеттеры для полей
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}
