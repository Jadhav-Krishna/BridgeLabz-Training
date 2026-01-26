package collections.ListInterface;
import java.util.*;

public class RotateElementsList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("Original List: " + numbers);

		int positions = 2;
		java.util.Collections.rotate(numbers, positions);

		System.out.println("List after rotating by " + positions + " positions: " + numbers);

	}

}
