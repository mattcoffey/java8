interface Dog extends Animal {
    default void sit() {
        System.out.println("Dog sit");
    }
}
