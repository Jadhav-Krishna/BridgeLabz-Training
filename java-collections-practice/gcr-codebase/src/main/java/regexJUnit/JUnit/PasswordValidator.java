package regexJUnit.JUnit;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null) return false;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasLength = password.length() >= 8;
        return hasUpper && hasDigit && hasLength;
    }
}
