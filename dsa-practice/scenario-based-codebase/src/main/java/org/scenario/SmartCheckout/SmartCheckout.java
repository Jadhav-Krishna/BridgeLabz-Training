package org.scenario.SmartCheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmartCheckout {
	Queue<Customer> queue = new LinkedList<>();
	HashMap<String, Items> store = new HashMap<>();
	
	void addCustomer(Customer c) {
		queue.add(c);
	}
	
	void billCustomer() {
		if(queue.isEmpty()) {
			System.out.println("No customer");
			return;
		}
		Customer c = queue.poll();
		int total = 0 ;
		for (String itemName : c.item) {
			Items item = store.get(itemName);
			if(item != null && item.stock>0) {
				total += item.price;
				item.stock--;
			}
		}
		System.out.println(c.name + "Amount : " + total);
	}
}
