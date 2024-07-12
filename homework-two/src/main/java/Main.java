import java.util.*;

public class Main {
    public static void main(String[] args) {
        printStringReverse("");
        printStringReverse("Hello world!");

        System.out.println(isIsrPhoneNumber("71231234567"));

        printSubStringReverse("Hello world!", 1, 4);

        System.out.println(getWordsReverse("Hello my nice world"));

        printWordsReverseInColumn("Hello my nice world");
    }

    public static void printStringReverse(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            System.out.println("Wrong string");
        }

        System.out.println(new StringBuilder(string).reverse());
    }

    public static Boolean isIsrPhoneNumber(String phone) {
        if (Objects.isNull(phone) || phone.isBlank()) {
            return null;
        }

        return phone.matches("7\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (Objects.isNull(string) || string.isBlank()
            || start < 0 || start > string.length()
            || finish < 0 || finish > string.length()
            || start > finish) {
            System.out.println("Wrong string");
        }

        String substring = string.substring(start, finish + 1);
        StringBuilder builder = new StringBuilder(substring);
        String srt = string.substring(0, start);
        String str2 = string.substring(finish + 1);
        System.out.println(srt + builder.reverse() + str2);
    }

    public static String getWordsReverse(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            return null;
        }

        return String.join(" ", Arrays.asList(string.split(" ")).reversed());
    }

    public static void printWordsReverseInColumn(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            System.out.println("Wrong string");
        }

        Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .peek(StringBuilder::reverse)
                .forEach(System.out::println);
    }
}
