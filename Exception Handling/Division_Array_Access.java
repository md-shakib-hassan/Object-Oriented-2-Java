import java.util.Scanner;

public class Division_Array_Access {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Input Two integer: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        int result = num1/num2;

        int arr[] = new int [3];

        System.out.println("Enter index where result will be store:");
        int index = input.nextInt();

        try{
            try{
               int divion = result/0;
                System.out.println("that number divide.");
            }catch (Exception e){
                System.out.println("Exception: "+e);

            }
            try {
                System.out.println("index is : "+arr[index]);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                System.out.println("invalid input.");
            } catch (Exception e) {
                System.out.println(e);
            }
        }catch(Exception e ){
            System.out.println(e);
        }



    }
}
