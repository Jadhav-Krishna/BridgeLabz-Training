package designPattern;

public class UserFactory {
    public User createUser(String role, String name) {
        if (role == null) {
            throw new IllegalArgumentException("role is required");
        }
        String key = role.trim().toLowerCase();
        switch (key) {
            case "student":
                return new Student(name);
            case "faculty":
                return new Faculty(name);
            case "librarian":
                return new Librarian(name);
            default:
                throw new IllegalArgumentException("unknown role: " + role);
        }
    }
}
