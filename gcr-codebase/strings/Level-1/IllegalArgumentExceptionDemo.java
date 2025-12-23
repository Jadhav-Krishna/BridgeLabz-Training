// demonstrate IllegalArgumentException

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        handleIllegalArgumentException();
        generateIllegalArgumentException();
    }

    // generate IllegalArgumentException
    public static void generateIllegalArgumentException() {
        String text = "Hello, World!";
        System.out.println(text.substring(10, 5));
    }

    // handle IllegalArgumentException
    public static void handleIllegalArgumentException() {
        String text = "Hello, World!";
        try {
            System.out.println(text.substring(10, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
