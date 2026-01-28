package annotationsReflection.reflection;

public class DynamicallyCreateObjects {
    static class Student {
        private String name;
        private int id;

        public Student() {
            this.name = "Default Name";
            this.id = 0;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + "}";
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("annotationsReflection.reflection.DynamicallyCreateObjects$Student");
            Object studentInstance = studentClass.getDeclaredConstructor().newInstance();
            System.out.println("Dynamically Created Student Instance: " + studentInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
