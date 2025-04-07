import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    @Setter
    String author;

    @Setter
    String title;

    @Setter
    double price;

    final List<String> reviews;

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
