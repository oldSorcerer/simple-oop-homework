import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        printStringReverse("");
        printStringReverse("Hello world!");

        System.out.println(isIsrPhoneNumber("71231234567"));

        printSubStringReverse("Hello world!", 1, 4);

        System.out.println(getWordsReverse("Hello my nice world"));

        System.out.println(getWordsReverseInColumn("Hello my nice world"));

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

        return phone.matches("^8\\d{10}");
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

    public static String getWordsReverseInColumn(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            System.out.println("Wrong string");
            return "";
        }

        return Arrays.stream(string.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public static int maxCharIndex(String string) {
        if (Objects.isNull(string) || string.isBlank()) {
            return -1;
        }

        Map<String, Long> map = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

//        Map<String, Integer> map = new HashMap<>();
//
//        string.chars()
//                .mapToObj(Character::toString)
//                .forEach(str -> map.merge(str, 1, Integer::sum));

//        return string.indexOf(map.entrySet().stream()
//                .filter(entry -> entry.getValue().equals(map.values().stream()
//                        .max(Long::compareTo)
//                        .orElseThrow()))
//                .findFirst()
//                .orElseThrow()
//                .getKey());

         return string.indexOf(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
