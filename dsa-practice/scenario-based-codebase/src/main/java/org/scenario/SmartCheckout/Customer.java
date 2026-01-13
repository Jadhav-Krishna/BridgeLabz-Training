package org.scenario.SmartCheckout;
import java.util.List;
public class Customer {
	String name;
	List<String> item;
	
	Customer(String name, List<String> item){
		this.name = name;
		this.item = item;
	}
}
