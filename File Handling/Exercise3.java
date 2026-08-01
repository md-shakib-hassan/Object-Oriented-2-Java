import java.io.FileReader;

public class Exercise3 {
    public static void main(String[] args) {
        
        try {

         FileReader fr = new FileReader("data.txt");

         int count =0;
         int ch = fr.read();

         while (ch!=-1) {
            count++;
            ch=fr.read();
            
         }

         fr.close();

        System.out.println("length:"+count);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
