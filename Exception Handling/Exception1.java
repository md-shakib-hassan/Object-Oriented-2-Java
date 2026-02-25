import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        try {
            int result = number/0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("that index don't exist.");
        }
    }

}
