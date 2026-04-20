import java.io.FileWriter;

public class fileWrite {

    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("text.txt");
            file.write("hello java");
            file.write("hello javascript.");
            file.close();

            System.out.println("succesfully write.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}