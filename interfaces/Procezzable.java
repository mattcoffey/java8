interface Procezzable {

    static void clazzMethod() {
        System.out.println("clazzy");
    }

    default void process() {
        System.out.println("pprroocceess");
    }
}
