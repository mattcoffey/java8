/*
 * run with -ea to throw an AssertionError
 */
public class Assertions {

    public static void main(String...args) {
        test_assertions();
        java.lang.System.out.println("Hello");
    }

    public static void test_assertions() {
        assert false: "Assertions work";
    }
}
