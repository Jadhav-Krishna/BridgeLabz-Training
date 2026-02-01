package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StockApp {

	public static void main(String[] args) {
		List<Double> stock = Arrays.asList(123.5,124.7,235.7,121.6,122.5);
		
		stock.forEach(price -> System.out.println("price of stock is : "+ price));
	}

}
