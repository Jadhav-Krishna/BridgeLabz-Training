// demonstrates generating and handling a NullPointerException
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        handleNullPointerException();
        generateNullPointerException();
    }
    // generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }
    // handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
