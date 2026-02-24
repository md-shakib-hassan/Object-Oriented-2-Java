public class Exception3 {
    public static void main(String[] args) {
        String name =null;
        try {
            int len = name.length();
            System.out.println("Lenth of text : "+len);

        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
    
}
