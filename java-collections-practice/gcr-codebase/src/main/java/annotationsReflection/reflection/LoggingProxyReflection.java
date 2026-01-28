package annotationsReflection.reflection;

public class LoggingProxyReflection {
    interface Greeting {
        String sayHello(String name);
    }

    static class GreetingImpl implements Greeting {
        @Override
        public String sayHello(String name) {
            return "Hello, " + name + "!";
        }
    }

    public static void main(String[] args) {
        try {
            Greeting originalGreeting = new GreetingImpl();

            Greeting proxyGreeting = (Greeting) java.lang.reflect.Proxy.newProxyInstance(
                    Greeting.class.getClassLoader(),
                    new Class[]{Greeting.class},
                    (proxy, method, methodArgs) -> {
                        System.out.println("Invoking method: " + method.getName());
                        return method.invoke(originalGreeting, methodArgs);
                    }
            );

            String response = proxyGreeting.sayHello("Alice");
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
