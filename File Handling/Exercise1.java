import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise1 {
    public static void main(String[] args) {
        
        try {

            FileWriter file = new FileWriter("text.txt");
            file.write("Name: MD. SHAKIB HASSAN\n");
            file.write("Dept: Software Engineering.\n");
            file.write("\nInstitution: Noakhali Science & Technology University.");

            file.close();

            System.out.println("succesfully write in file.");

            FileReader file1 = new FileReader("text.txt");

            BufferedReader br = new BufferedReader(file1);

            String line ;

            while ((line=br.readLine())!= null) {
                System.out.println(line);
            }
            file1.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
