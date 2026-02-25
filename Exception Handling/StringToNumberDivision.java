import java.util.Scanner;

public class StringToNumberDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first value (as string): ");
            String s1 = sc.next();
            System.out.print("Enter second value (as string): ");
            String s2 = sc.next();

            int a = Integer.parseInt(s1);  
            int b = Integer.parseInt(s2);

            int result = a / b;             
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
