import java.util.Scanner;

public class Exception5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number : ");
            float num2 = input.nextInt();
            if (num1 == num2) {
                System.out.println("Same number.");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}
