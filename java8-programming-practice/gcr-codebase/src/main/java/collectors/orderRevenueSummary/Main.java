package collectors.orderRevenueSummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Order> orders = List.of(
			    new Order("Rahul", 1200.50),
			    new Order("Amit", 800.00),
			    new Order("Rahul", 300.00),
			    new Order("Amit", 700.00),
			    new Order("Sneha", 1500.00)
			);

			Map<String, Double> revenueByCustomer =orders.stream().collect(Collectors.groupingBy(Order::getCustomer,Collectors.summingDouble(Order::getAmount)));

			System.out.println(revenueByCustomer);

	}

}
