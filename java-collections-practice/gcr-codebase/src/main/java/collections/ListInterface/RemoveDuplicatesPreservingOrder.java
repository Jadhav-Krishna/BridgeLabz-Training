package collections.ListInterface;
import java.util.*;

public class RemoveDuplicatesPreservingOrder {
	
	public static int[] removeDuplicates(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int[] result = new int[set.size()];
		int index = 0;
		for (int num : set) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 2, 4, 1, 5, 3};

		int[] resultArray = removeDuplicates(inputArray);

		System.out.print("removing duplicates: " + Arrays.toString(resultArray));

	}

}
