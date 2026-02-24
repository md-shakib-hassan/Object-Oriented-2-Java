import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine(); 

        try {
            int number = Integer.parseInt(input); 
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
            System.out.println("Please enter a valid integer.");
        }

        System.out.println("Program finished safely.");
        sc.close();
    }
}
