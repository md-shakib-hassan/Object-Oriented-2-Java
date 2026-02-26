import java.util.Scanner;

public class FileNameLength {
    public static void main(String[] args) {
        
        try {
            Scanner input = new Scanner(System.in);
            String name;
            System.out.print("Enter String:");
            name = input.nextLine();

            System.out.println("Enter a index number to see character:");
            int index =input.nextInt();

            char ch = name.charAt(index);

            int num =Integer.parseInt(name);
            System.out.println("double value :"+num*2);
            
        } catch (NullPointerException e) {
            System.out.println(e);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
