public class Question_4_5 {
    public void test() {
        System.out.println("Q test");
    }
    public static void main(String...args) {
        F q = new Question_4_5();
        q.test();
    }
}

interface F {
    static void test() {
        System.out.println("F test");
    }
}
