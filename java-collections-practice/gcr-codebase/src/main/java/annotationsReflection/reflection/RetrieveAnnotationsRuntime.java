package annotationsReflection.reflection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class RetrieveAnnotationsRuntime {
    @Retention(RetentionPolicy.RUNTIME)
    @interface Author {
        String name();
    }

    @Author(name = "Shna Gurjar")
    static class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }
    }

    public static void main(String[] args) {
        try {
            Class<Book> bookClass = Book.class;
            if (bookClass.isAnnotationPresent(Author.class)) {
                Author authorAnnotation = bookClass.getAnnotation(Author.class);
                System.out.println("Author of the Book: " + authorAnnotation.name());
            } else {
                System.out.println("No Author annotation present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
