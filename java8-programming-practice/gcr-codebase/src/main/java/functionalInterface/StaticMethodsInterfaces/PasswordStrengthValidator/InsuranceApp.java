package functionalInterface.StaticMethodsInterfaces.PasswordStrengthValidator;

public class InsuranceApp {

    public static void main(String[] args) {

        String p1 = "Krishna@123";
        String p2 = "simple123";

        System.out.println(SecurityUtils.isStrongPassword(p1)); 
        System.out.println(SecurityUtils.isStrongPassword(p2)); 
    }
}
