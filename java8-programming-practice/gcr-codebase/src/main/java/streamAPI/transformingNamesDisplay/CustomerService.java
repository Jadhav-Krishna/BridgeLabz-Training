package streamAPI.transformingNamesDisplay;

import java.util.List;

public class CustomerService {
	public List<String> customerSort(List<String> customer){
		return customer.stream().map(String::toUpperCase).sorted().toList();
	}

}
