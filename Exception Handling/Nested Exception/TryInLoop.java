
import java.util.Scanner;

public class TryInLoop {
    public static void main(String[] args) {
    
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Iteration " + (i + 1) + " ---");

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();
                int value;

                
                try {
                    value = arr[index];
                    System.out.println("Array value: " + value);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Error: Index " + index + " is out of bounds.");
                    continue;  
                }

                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + value + " / " + divisor + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Error: Cannot divide by zero.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Input Error: Please enter valid integers.");
                sc.nextLine();
            }
        }

        System.out.println("\nLoop completed.");
    }
}
 