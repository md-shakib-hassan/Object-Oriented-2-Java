import java.io.FileWriter;

public class Practice_1 {
    public static void main(String[] args) {
        
        try {
            
            FileWriter file = new FileWriter("data.txt");

            file.write("hello oop");
            file.close();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
