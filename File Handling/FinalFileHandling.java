import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FinalFileHandling {
    public static void main(String[] args) {
       
        try {
            
            File file = new File("final.txt");

            FileWriter file1 = new FileWriter("final.txt",true);

            file1.write("i want to a product owner which provide service for 10M Peoples.");
            file1.write("inshaallah one day i will fulfill my dream.");

            file1.close();

            FileReader file2 = new FileReader("final.txt");

            int ch = file2.read();

            while (ch!=-1) {
                System.out.print((char)ch);
                ch = file2.read();   
            }

            file2.close();

        } catch (Exception e) {
            System.out.println(e);
        }


        try {

            BufferedWriter br = new BufferedWriter(new FileWriter("final.txt",true));

            br.write("inshallah");

            System.out.println("using bufferWriter complete or successful");

            br.close();

            BufferedReader bw = new BufferedReader(new FileReader("final.txt"));

            String line;

            while ((line=bw.readLine())!=null) {

                System.out.println(line);             

            }

            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
