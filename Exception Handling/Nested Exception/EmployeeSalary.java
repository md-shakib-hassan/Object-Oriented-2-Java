import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        int[] salaryArray = new int[5];
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter salary as a string: ");
            String salaryStr = sc.next();

            int salary;

            
            try {
                salary = Integer.parseInt(salaryStr);
                System.out.println("Salary parsed: " + salary);
            } catch (NumberFormatException e) {
                System.out.println("Parse Error: Salary is not a valid number.");
                return;
            }

          
            try {
                System.out.print("Enter array index to store salary (0-4): ");
                int index = sc.nextInt();
                salaryArray[index] = salary;
                System.out.println("Salary stored at index " + index);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Storage Error: Index out of bounds. Valid range is 0-4.");
                return;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input Error: Index must be an integer.");
                return;
            }

            
            try {
                System.out.print("Enter number of months to divide salary: ");
                int months = sc.nextInt();
                int monthlySalary = salary / months;  
                System.out.println("Monthly salary (annual / " + months + "): " + monthlySalary);
            } catch (ArithmeticException e) {
                System.out.println("Division Error: Months cannot be zero.");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input Error: Months must be an integer.");
            }

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}