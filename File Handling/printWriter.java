import java.io.FileReader;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) {
       
        try {
            PrintWriter pw = new PrintWriter ("text.txt");
            pw.println("Hello JAVA");
            pw.println(3.1516);
            pw.println(10);
            pw.close();

            System.out.println("succesfully complete.");
            
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            
        FileReader fr = new FileReader("text.txt");

        int ch=fr.read();
        while (ch!=-1) {
            System.out.print((char) ch);
            ch=fr.read();
        }
        fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
