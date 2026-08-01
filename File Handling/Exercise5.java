import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise5 {
    public static void main(String[] args) {
        
        try {
            BufferedReader file = new BufferedReader(new FileReader("data.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

            String line ;
            while ((line=file.readLine())!=null) {
                bw.write(line);

            }
            file.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
