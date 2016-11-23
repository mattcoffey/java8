import java.util.*;

public class Instance {
    public static void main(String...args) {
        List<Number> numbers = new ArrayList<>();
        if (numbers instanceof List<?>) {
            System.out.println("numbers is a list of anything");
        }
        else {
            System.out.println("numbers is not a list of anything");
        }
    }
}
