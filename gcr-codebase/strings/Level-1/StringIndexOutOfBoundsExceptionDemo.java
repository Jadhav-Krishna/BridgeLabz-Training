// demonstrate StringIndexOutOfBoundsException

public class StringIndexOutOfBoundsExceptionDemo  {
    public static void main(String[] args) {
        handleStringIndexOutOfBoundsException();
        generateStringIndexOutOfBoundsException();
    }

    // generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException() {
        String text = "Hello, World!";
        System.out.println(text.charAt(20));
    }

    // handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException() {
        String text = "Hello, World!";
        try {
            System.out.println(text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
