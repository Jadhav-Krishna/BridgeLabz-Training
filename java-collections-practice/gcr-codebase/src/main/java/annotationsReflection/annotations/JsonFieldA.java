package annotationsReflection.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Field;

public class JsonFieldA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface JsonField {
        String name();
    }

    public static class User {
        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_age")
        private int age;

        private String password;

        public User(String username, int age, String password) {
            this.username = username;
            this.age = age;
            this.password = password;
        }
    }

    public static String toJson(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                if (!firstField) {
                    jsonBuilder.append(", ");
                }
                JsonField annotation = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    jsonBuilder.append("\"").append(annotation.name()).append("\": ");
                    if (value instanceof String) {
                        jsonBuilder.append("\"").append(value).append("\"");
                    } else {
                        jsonBuilder.append(value);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                firstField = false;
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

    public static void main(String[] args) {
        User user = new User("john_doe", 30, "secret");
        String jsonString = toJson(user);
        System.out.println(jsonString);
    }
}
