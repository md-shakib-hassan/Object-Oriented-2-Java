import java.util.Scanner;

public class ProductPriceParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter price:");
            String price = input.nextLine();
            int convert = Integer.parseInt(price);
            int arr[]= new int[5];

            System.out.print("\n Enter a position to assign value(0-4):");
            int index = input.nextInt();
            arr[index]=convert;
            System.out.println("Here price: "+(float)(1000 / convert));

        } catch (NumberFormatException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
