package annotationsReflection.reflection;
import java.lang.reflect.Field;

public class AccessPrivateField {
    static class Person {
        private int age;

        public Person() {
            this.age = 0;
        }
}
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Class<?> personClass = person.getClass();
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(person, 30);
            int ageValue = ageField.getInt(person);
            System.out.println("Modified Age: " + ageValue);
        } catch (Exception e) {
            e.printStackTrace();
}
    }
}
