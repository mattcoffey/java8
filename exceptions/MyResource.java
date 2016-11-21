public class MyResource implements AutoCloseable {

    public static void main(String...args) {
        try (MyResource res = new MyResource()) {
            
        } catch (Exception e) {

        }
    }

    public void close() throws NullPointerException {
        throw new NullPointerException("Exception 2");
    }
}
