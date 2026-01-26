package collections.ListInterface;
import java.util.*;

public class ReverseList {
	public static void manualReverseList(List<String> names) {
		for(int i = 0, j = names.size() - 1; i < j; i++, j--) {
			String temp = names.get(i);
			names.set(i, names.get(j));
			names.set(j, temp);
		}
		System.out.println("Manually Reversed LinkedList : " + names);
		
	}
		public static void main(String[] args) {
		List<String> names = new LinkedList<>(Arrays.asList("Shna", "Ballu", "Chetan", "Devil", "Ergon"));
		manualReverseList(names);
		System.out.println("Reversed LinkedList : " + names);
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Elderberry");
		Collections.reverse(list);
	}
}
