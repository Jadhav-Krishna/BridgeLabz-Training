package designPattern;

public abstract class User implements NotificationObserver {
    private final String name;

    protected User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
