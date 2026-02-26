
import java.util.Scanner;

public class StringParsing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a String: ");
            String example = input.nextLine();
            try {
                System.out.print("\nGive a position for String character: ");
                int position = input.nextInt();
                char ch = example.charAt(position);
                System.out.println(ch);

                try {
                    int convert = Integer.parseInt(example);

                } catch (NumberFormatException e) {
                    System.out.println(e);
                }

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}