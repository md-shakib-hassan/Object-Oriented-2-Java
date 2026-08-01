import java.util.InputMismatchException;
import java.util.Scanner;

public class Division_Array_Access {
    public static void main(String[] args) {


        try {
            int num1, num2;
            System.out.println("Input Two integer. ");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            int result = num1 / num2;

            int arr[] = new int[3];

            System.out.println("Enter index where result will be store:");
            int index = input.nextInt();

            arr[index] = result;
            // int divison = result/0;
            System.out.println("divison successful.");

        } catch (ArithmeticException e) {
           System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(InputMismatchException e){
                System.out.println(e);
        }

    }
}
