public class Assertion {

    private static int numberOfTask = 1;

    public static void assertEquals(Object expected, Object actual) throws IllegalArgumentException {
        if (!expected.equals(actual)) {
            throw new IllegalArgumentException(
                    String.format("expected result is %s , but actual %s",
                            expected,
                            actual));
        } else {
            System.out.printf("task %s - done%n", numberOfTask++);
        }
    }
}
