public class Exception2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        try {
            System.out.println("Index number 5 :" + arr[10]);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("that index don't exist.");
        }
    }

}
