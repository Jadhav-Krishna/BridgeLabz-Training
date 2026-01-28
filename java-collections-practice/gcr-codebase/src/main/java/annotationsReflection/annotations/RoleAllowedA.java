package annotationsReflection.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class RoleAllowedA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface RoleAllowed {
        String value();
    }

    public static class SecureService {
        @RoleAllowed("ADMIN")
        public void adminOnlyOperation() {
            System.out.println("Admin operation executed.");
        }

        public void generalOperation() {
            System.out.println("General operation executed.");
        }
    }

    public static void main(String[] args) {
        SecureService service = new SecureService();
        String currentUserRole = "USER";

        for (Method method : SecureService.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (roleAllowed.value().equals(currentUserRole)) {
                    try {
                        method.invoke(service);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Access Denied!");
                }
            } else {
                try {
                    method.invoke(service);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
