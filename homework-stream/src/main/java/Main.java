import java.util.*;

public class Main {

    private static final List<Book> books = new ArrayList<>();

    private static final Book book1 = new Book("Автор 1", "Книга 1", 29.99);
    private static final Book book2 = new Book("Автор 2", "Книга 2", 19.99);
    private static final Book book3 = new Book("Автор 3", "Книга 3", 24.99);
    private static final Book book4 = new Book("Автор 2", "Книга 4", 124.99);

    static {
        book1.addReview("Отличная книга!");
        book1.addReview("Мне понравилось");
        book2.addReview("Рекомендую всем!");

        // Создание списка и добавление книг в него
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }

    public static void main(String[] args) {

        //Тесты и вызов методов с заданием
        //Задание 1
        task1();

        //Задание 2
        task2();

        //Задание 3
        task3();

        //Задание 4
        task4();

        //Задание 5
        task5();

        //Задание 6
        task6();

        //Задание 7
        task7();

        //Задание 8
        task8();

        //Задание 9
        task9();

        //Задание 10
        task10();

        //Задание 11
        task11();

        //Задание 12
        task12();
    }

    private static void task1() {
        //ожидаемый результат
        int expected = 199;

        //актуальный результат
        double sum = TaskStream.task1(books);
        int actual = (int) sum;

        //тест
        Assertion.assertEquals(expected, actual);
    }

    private static void task2() {
        //ожидаемый результат
        long expected = 3L;

        //актуальный результат
        long actual = TaskStream.task2(books);

        //тест
        Assertion.assertEquals(expected, actual);
    }

    private static void task3() {
        //ожидаемый результат
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("Книга 1", Arrays.asList("Отличная книга!", "Мне понравилось"));
        expectedMap.put("Книга 2", Collections.singletonList("Рекомендую всем!"));
        expectedMap.put("Книга 3", Collections.emptyList());
        expectedMap.put("Книга 4", Collections.emptyList());

        //актуальный результат
        Map<String, List<String>> actualMap = TaskStream.task3(books);

        //тест
        Assertion.assertEquals(expectedMap, actualMap);
    }

    private static void task4() {
        //ожидаемый результат
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("Книга 1", Arrays.asList("Отличная книга!", "Мне понравилось"));
        expectedMap.put("Книга 2", Collections.singletonList("Рекомендую всем!"));

        //актуальный результат
        Map<String, List<String>> actualMap = TaskStream.task4(books);

        //тест
        Assertion.assertEquals(expectedMap, actualMap);
    }

    private static void task5() {
        //ожидаемый результат
        List<String> expectedList = Arrays.asList("Отличная книга!", "Мне понравилось", "Рекомендую всем!");

        //актуальный результат
        List<String> actualList = TaskStream.task5(books);

        //тест
        Assertion.assertEquals(expectedList, actualList);
    }

    private static void task6() {
        //ожидаемый результат
        int expected = 49;

        //актуальный результат
        double average = TaskStream.task6(books);
        int actual = (int) average;

        //тест
        Assertion.assertEquals(expected, actual);
    }

    private static void task7() {
        //ожидаемый результат
        boolean expected = true;

        //актуальный результат
        boolean actual = TaskStream.task7(books);

        //тест
        Assertion.assertEquals(expected, actual);
    }

    private static void task8() {
        //ожидаемый результат
        boolean expected = true;

        //актуальный результат
        Set<String> titles = TaskStream.task8(books);
        boolean actual = titles.containsAll(Arrays.asList("Книга 1", "Книга 2", "Книга 3"));

        //тест
        Assertion.assertEquals(expected, actual);
    }

    private static void task9() {
        //ожидаемый результат
        List<Book> expectedList = Collections.singletonList(book2);

        //актуальный результат
        List<Book> actualList = TaskStream.task9(books);

        //тест
        Assertion.assertEquals(expectedList, actualList);
    }

    private static void task10() {
        //ожидаемый результат
        Map<String, List<Book>> expectedMap = new HashMap<>();
        expectedMap.put("Not Ok", Collections.singletonList(book4));
        expectedMap.put("OK", Arrays.asList(book1, book2, book3));

        //актуальный результат
        Map<String, List<Book>> actualMap = TaskStream.task10(books);

        //тест
        Assertion.assertEquals(expectedMap, actualMap);
    }

    private static void task11() {
        //ожидаемый результат
        List<Book> expectedList = Collections.singletonList(book2);

        //актуальный результат
        List<Book> actualList = TaskStream.task11(books);

        //тест
        Assertion.assertEquals(expectedList, actualList);
    }

    private static void task12() {
        //ожидаемый результат
        Book expectedBook = book2;

        //актуальный результат
        Book actualBook = TaskStream.task12(books);

        //тест
        Assertion.assertEquals(expectedBook, actualBook);
    }
}
