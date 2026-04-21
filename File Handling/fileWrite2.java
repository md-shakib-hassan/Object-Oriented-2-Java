import java.io.FileWriter;

public class fileWrite2 {
    public static void main(String[] args) {
       
        try {
            FileWriter file = new FileWriter("text.txt",true);
            file.write("\nhello java");
            file.write("\nhello javascript.");
            file.close();

            System.out.println("succesfully write.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
