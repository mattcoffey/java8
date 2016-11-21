public class Multi {
    public static void main(String...args) {
        System.out.print("\u001B[32m");
        try {
            int size = Integer.valueOf(args[0]);
            for(int i = 1; i <= size; i++) {
                System.out.println(args[i]);
            }
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.print("\u001B[31m");
            e.printStackTrace();
        }
        finally {
            System.out.println("\u001B[32mFinished!");
        }
    }
}
