package annotationsReflection.reflection;

public class JSONRepresentation {
    static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }

    public static String toJSON(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        try {
            Class<?> objClass = obj.getClass();
            java.lang.reflect.Field[] fields = objClass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                String fieldName = fields[i].getName();
                Object fieldValue = fields[i].get(obj);
                jsonBuilder.append("\"").append(fieldName).append("\": ");
                if (fieldValue instanceof String) {
                    jsonBuilder.append("\"").append(fieldValue).append("\"");
                } else {
                    jsonBuilder.append(fieldValue);
                }
                if (i < fields.length - 1) {
                    jsonBuilder.append(", ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
    public static void main(String[] args) {
        Person person = new Person("Shna", 30, "New York");
        String jsonRepresentation = toJSON(person);
        System.out.println(jsonRepresentation);
    }
}
