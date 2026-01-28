package annotationsReflection.annotations;
import java.util.*;
public class SuppressWarningss {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
