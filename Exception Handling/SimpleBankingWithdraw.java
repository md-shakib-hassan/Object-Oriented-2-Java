import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;

public class SimpleBankingWithdraw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Balance:");

            int balance = input.nextInt();
            
            System.out.print("\nEnter withdraw balance:");
            int withdraw = input.nextInt();
            if(withdraw<0){
                throw new IllegalArgumentException();
            }
            System.out.print("\nEnter divisor:");
            int divisor = input.nextInt();

            balance -=withdraw;
            System.out.println("Calculate balance: "+(balance/divisor));


        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
