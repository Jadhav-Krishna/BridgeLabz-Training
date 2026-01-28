package annotationsReflection.reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class DIContainer {

    private final Map<Class<?>, Object> container = new HashMap<>();

    public <T> T getBean(Class<T> clazz) {
        try {
            if (container.containsKey(clazz)) {
                return clazz.cast(container.get(clazz));
            }

            T instance = clazz.getDeclaredConstructor().newInstance();
            container.put(clazz, instance);

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Class<?> depType = field.getType();
                    Object dependency = getBean(depType);

                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }
            return instance;

        } catch (Exception e) {
            throw new RuntimeException("DI failed for class: " + clazz.getName(), e);
        }
    }
}

class UserRepository {
    public String getUser() {
        return "Krishna";
    }
}

class UserService {
    @Inject
    private UserRepository userRepository;

    public void printUser() {
        System.out.println("User: " + userRepository.getUser());
    }
}

public class DependencyInjectionReflection {

    public static void main(String[] args) {

        DIContainer di = new DIContainer();
        UserService service = di.getBean(UserService.class);

        service.printUser();
    }
}
