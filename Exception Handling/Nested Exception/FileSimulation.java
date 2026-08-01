import java.util.Scanner;

public class FileSimulation {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        String lines[] = { "10", "20", "abc", "40", "50" };

        try {

            System.out.print("Enter line number (0-4): ");
            int lineNumber = input.nextInt();
            input.nextLine();

            try {

                String line = lines[lineNumber];

                try {

                    int value = Integer.parseInt(line);

                    try {

                        System.out.print("Enter divisor: ");
                        int divisor = input.nextInt();
                        int result = value / divisor;

                        System.out.println("Result of division: " + result);

                    } catch (ArithmeticException e) {
                        System.out.println("Arithmetic Error: " + e);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Number Format Error: " + e);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Error: " + e);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }

        input.close();
    }
}