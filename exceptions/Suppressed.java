
public class Suppressed {
    public static void main(String...args) {
        try (MyResource r = new MyResource()) {
            throw new Exception("Exception 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            java.util.stream.Stream.of(e.getSuppressed())
                .forEach(t -> System.out.println(t.getMessage()));
        }        
    }
}
