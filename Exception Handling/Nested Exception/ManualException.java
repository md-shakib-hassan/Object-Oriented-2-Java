import java.util.InputMismatchException;
import java.util.Scanner;

public class ManualException{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your age:");
            int age = input.nextInt();
            System.out.print("\nEnter a number:");
            int number = input.nextInt();
            if(age<18){
                throw new Exception("Beda boro ho valo meye pabi.");
            }
            try {
                int divide = 100/number;

            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } 
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}