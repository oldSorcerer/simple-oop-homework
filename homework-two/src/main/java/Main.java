import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        printStringReverse("");
        printStringReverse("Hello world!");

        System.out.println(isIsrPhoneNumber("71231234567"));

        printSubStringReverse("Hello world!", 1, 4);

        System.out.println(getWordsReverse("Hello my nice world"));

        printWordsReverseInColumn("Hello my nice world");

        System.out.println(maxCharIndex("ddcccabbbb"));
    }

    public static void printStringReverse(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            System.out.println("Wrong string");
            return;
        }

        System.out.println(new StringBuilder(string).reverse());
    }

    public static Boolean isIsrPhoneNumber(String phone) {
        if (Objects.isNull(phone) || phone.isBlank()) {
            return null;
        }

        return phone.matches("8\\d{10}");
    }

    public static void printSubStringReverse(String string, int start, int finish) {
        if (Objects.isNull(string) || string.isBlank()
            || start < 0 || start > string.length()
            || finish < 0 || finish > string.length()
            || start > finish) {
            System.out.println("Wrong string");
            return;
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

        String str = Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining("\n"));
        System.out.println(str);
    }

    public static int maxCharIndex(String string) {

        Map<Character, Integer> map = new HashMap<>();

        string.chars().boxed()
                .map(Character::highSurrogate)
                .forEach(character -> map.merge(character, 1, Integer::sum));

//        for (char aChar : string.toCharArray()) {
//            map.merge(aChar, 1, Integer::sum);
//        }

        return string.indexOf(map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(map.values().stream()
                        .max(Integer::compareTo)
                        .orElseThrow()))
                .findFirst().orElseThrow().getKey());
    }
}
