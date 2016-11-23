import java.util.*;
import java.util.concurrent.*;

public class Utils {
    public <T> void print(T t) {
        System.out.println(t);
    }
    public static void main(String...args) {
        new Utils().<Integer>print(0);
        List<? extends RunnableFuture> list = new ArrayList<RunnableFuture>();
        list = new ArrayList<FutureTask>();
        list = new ArrayList<>();
        List<? extends Runnable> runnables = list;


    }
}
