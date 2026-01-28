package lambdaExpressions;

import java.util.Arrays;

public class NameUpperCasing {

    public static void main(String[] args) {
        String[] employeeNames = {"Harsh", "Yash", "Ram", "Shyam", "Anita"};

        System.out.println("Employee Names in Uppercase:");
        Arrays.stream(employeeNames).map(String::toUpperCase).forEach(System.out::println);
    }
}
