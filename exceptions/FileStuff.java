import java.io.*;

public class FileStuff {
    public static void main(String...args) {
        try(
            FileReader fr = new FileReader("wat.txt");
            BufferedReader br = new BufferedReader(fr)
            ) {
            int value = 0;
            while((value = br.read()) != -1) {
                System.out.println((char)value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
