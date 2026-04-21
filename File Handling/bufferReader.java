import java.io.BufferedReader;
import java.io.FileReader;

public class bufferReader {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("text.txt");
            BufferedReader br  = new BufferedReader(file);

            String line;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
