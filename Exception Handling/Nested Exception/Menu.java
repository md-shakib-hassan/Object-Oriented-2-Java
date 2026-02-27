import java.io.CharConversionException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.print("\nEnter 1 for Convert String.\nEnter 2 for Array Access. \nEnter 3 for Division  . \nEnter 4 for Stop Input.\n\n\n Enter your choice:");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    try {
                        System.out.print("\nEnter a String:");
                        String example = input.nextLine();
                        int convert = Integer.parseInt(example);
                        System.out.println(convert);

                    } catch (NumberFormatException e) {
                       System.out.println(e);
                    }

                    break;

                case 2:
                    try {
                        
                        int arr[]={23,24,65,78,9};
                        System.out.print("\nEnter a Index position(0-4):");
                        int index = input.nextInt();
                        System.out.println("valid index and number is: "+arr[index]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }

                break;

                case 3:
                    
                    try {
                        System.out.print("Enter Two Number:");
                        System.out.print("\nEnter first number:");
                        num1 = input.nextInt();
                        System.out.print("\nEnter Second Number:");
                        num2 = input.nextInt();
                        try {
                            int divide = num1 / num2;
                            System.out.println(divide);
                        } catch (ArithmeticException e) {
                            System.out.println(e);
                        }catch(InputMismatchException e){
                            System.out.println(e);
                        }

                    } catch (Exception e) {
                       System.out.println("Invalid number input.");
                    }

                    break;


                case 4:
                    return ;
                   

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        
    }
}
