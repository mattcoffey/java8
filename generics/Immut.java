import java.util.*;

public class Immut {
    public static void main(String...args) {
        List<? super Integer> superIntegers = new ArrayList<>();
        List<? extends Number> extendsNumbers = new ArrayList<>();

        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        superIntegers = integers;
        superIntegers = numbers;
        extendsNumbers = numbers;
        extendsNumbers = integers;
        superIntegers.add(1);
    }
}
