public class Assert {
    public static void main(String...args) {
        assert false: "Assertion is false";
        if(false) throw new AssertionError("Assertion is false");
    }
}
