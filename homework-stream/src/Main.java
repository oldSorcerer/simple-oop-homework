import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Создание трех объектов Book
        Book book1 = new Book("Автор 1", "Книга 1", 29.99);
        Book book2 = new Book("Автор 2", "Книга 2", 19.99);
        Book book3 = new Book("Автор 3", "Книга 3", 24.99);
        Book book4 = new Book("Автор 2", "Книга 4", 124.99);

        book1.addReview("Отличная книга!");
        book1.addReview("Мне понравилось");
        book2.addReview("Рекомендую всем!");

        // Создание списка и добавление книг в него
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);


        //Тесты и вызов методов с заданием
        //Задание 1
        double sum = TaskStream.task1(books);
        Assertion.assertEquals(199, (int) sum);

        //Задание 2
        long count = TaskStream.task2(books);
        Assertion.assertEquals(3L, count);

        //Задание 3
        Map<String, List<String>> bookReviews = TaskStream.task3(books);
        //ожидаемый результат
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("Книга 1", Arrays.asList("Отличная книга!", "Мне понравилось"));
        expectedMap.put("Книга 2", Collections.singletonList("Рекомендую всем!"));
        expectedMap.put("Книга 3", Collections.emptyList());
        expectedMap.put("Книга 4", Collections.emptyList());
        //тест
        Assertion.assertEquals(expectedMap, bookReviews);

        //Задание 4
        Map<String, List<String>> bookReviews2 = TaskStream.task4(books);
        //ожидаемый результат
        Map<String, List<String>> expectedMap2 = new HashMap<>();
        expectedMap2.put("Книга 1", Arrays.asList("Отличная книга!", "Мне понравилось"));
        expectedMap2.put("Книга 2", Collections.singletonList("Рекомендую всем!"));
        //тест
        Assertion.assertEquals(expectedMap2, bookReviews2);

        //Задание 5
        List<String> reviews = TaskStream.task5(books);
        Assertion.assertEquals(Arrays.asList("Отличная книга!", "Мне понравилось", "Рекомендую всем!"), reviews);

        //Задание 6
        double average = TaskStream.task6(books);
        Assertion.assertEquals(49, (int) average);

        //Задание 7
        boolean authorExists = TaskStream.task7(books);
        Assertion.assertEquals(true, authorExists);

        //Задание 8
        Set<String> titles = TaskStream.task8(books);
        Assertion.assertEquals(true, titles.containsAll(Arrays.asList("Книга 1", "Книга 2", "Книга 3")));

        //Задание 9
        List<Book> booksActual = TaskStream.task9(books);
        Assertion.assertEquals(Collections.singletonList(book2), booksActual);

        //Задание 10
        Map<String, List<Book>> oks = TaskStream.task10(books);
        //ожидаемый результат
        Map<String, List<Book>> expectedMap3 = new HashMap<>();
        expectedMap3.put("Not Ok", Collections.singletonList(book4));
        expectedMap3.put("OK", Arrays.asList(book1, book2, book3));
        //тест
        Assertion.assertEquals(expectedMap3, oks);

        //Задание 11
        List<Book> recommended = TaskStream.task11(books);
        Assertion.assertEquals(Collections.singletonList(book2), recommended);

        //Задание 12
        Book cheap = TaskStream.task12(books);
        Assertion.assertEquals(book2, cheap);
    }
}
