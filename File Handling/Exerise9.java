import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exerise9 {

    public static void main(String[] args) {

        String fileName = "file.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            // Header
            writer.write("ID,Name,CGPA");
            writer.newLine();

            // Student Data
            writer.write("101,Ali,3.75");
            writer.newLine();

            writer.write("102,Sara,3.90");
            writer.newLine();

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
