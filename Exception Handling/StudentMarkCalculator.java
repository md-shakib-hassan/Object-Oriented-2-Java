import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int arr[] = new int[5];
            System.out.print("Enter number for input numbers:");
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextInt();
            }
            System.out.print("Give me a index (0-4):");
            int index = input.nextInt();

            System.out.println("Here the result:"+arr[index]);

            System.out.println("Here another user give a number :");
            int div = input.nextInt();

            int result = arr[index] / div;

        } catch ( IndexOutOfBoundsException e) {
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println(e);
        }

    }
}
