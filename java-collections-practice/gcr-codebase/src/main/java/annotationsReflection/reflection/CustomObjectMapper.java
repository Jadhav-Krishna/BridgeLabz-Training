package annotationsReflection.reflection;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(obj, fieldValue);

                } catch (NoSuchFieldException e) {
                    System.out.println("No such field: " + fieldName);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Error while mapping Map to Object", e);
        }
    }

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Krishna");
        data.put("age", 22);

        Student student = toObject(Student.class, data);
        System.out.println(student);
    }
}

class Student {
    private int id;
    private String name;
    private int age;

    public Student() {}

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

