package streamAPI.transformingNamesDisplay;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList("rahul","Amit","neha","Pooja","vikram");

        CustomerService service = new CustomerService();

        service.customerSort(customers).forEach(System.out::println);
    }
}
