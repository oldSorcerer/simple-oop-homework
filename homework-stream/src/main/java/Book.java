import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Book {
    @Setter
    private String author;
    @Setter
    private String title;
    @Setter
    private double price;
    private final List<String> reviews;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}
