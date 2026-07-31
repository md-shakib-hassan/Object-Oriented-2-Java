import java.io.FileWriter;

public class Exercise2 {
    public static void main(String[] args) {
        try {

            FileWriter file = new FileWriter("text.txt",true);
           
            file.write("\nCourse name: Object Oriented Concept-II");
            file.write("\nhello good night");

            System.out.println("succesfully write in file.");

            file.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
