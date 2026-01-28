package annotationsReflection.annotations;
import java.lang.annotation.*;

public class MaxLengthA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface MaxLength {
        int value();
    }

    public static class User {
        @MaxLength(10)
        private String username;

        public User(String username) {
            validateMaxLength(username);
            this.username = username;
        }

        private void validateMaxLength(String value) {
            try {
                MaxLength maxLength = this.getClass()
                        .getDeclaredField("username")
                        .getAnnotation(MaxLength.class);
                if (maxLength != null && value.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength.value());
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            User user1 = new User("shortname");
            System.out.println("User1 created successfully.");

            User user2 = new User("thisisaverylongusername");
            System.out.println("User2 created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
