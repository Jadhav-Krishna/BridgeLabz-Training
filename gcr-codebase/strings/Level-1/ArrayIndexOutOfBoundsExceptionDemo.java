// demonstrate ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        handleArrayIndexOutOfBoundsException();
        generateArrayIndexOutOfBoundsException();
    }

    // generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]);
    }

    // handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {
        String[] names = {"A", "B", "C"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
