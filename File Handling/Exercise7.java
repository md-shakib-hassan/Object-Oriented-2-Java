import java.io.FileReader;
import java.io.FileWriter;

public class Exercise7 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");

            FileWriter writer = new FileWriter("text.txt");

            int ch = reader.read();

            while(ch!=-1){
                if((int)ch%2==0){
                    writer.write(ch);
                }
                ch = reader.read();
            }
            reader.close();
            writer.close();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
