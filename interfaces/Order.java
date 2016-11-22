interface Order {
    default void process() {
        System.out.println("ordering");
    }
}
