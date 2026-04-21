import java.io.FileWriter;

public class Exercise1 {
    public static void main(String[] args) {
        
        try {

            FileWriter file = new FileWriter("text.txt");
            file.write("Name: MD. SHAKIB HASSAN\n");
            file.write("Dept: Software Engineering.\n");
            file.write("\nInstitution: Noakhali Science & Technology University.");

            System.out.println("succesfully write in file.");

            file.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
