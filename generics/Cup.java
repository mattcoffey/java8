
// Apparently this syntax is ok
public class Cup<SHUT_THE_FUCK_UP> {

    private SHUT_THE_FUCK_UP stfu;
    
    public Cup(SHUT_THE_FUCK_UP stfu) {
        this.stfu = stfu;
    }
    public void drink() {
        System.out.println(stfu.toString());
    }
    public static void main(String...args) {
        new Cup<String>("(=D").drink();
    }
}
