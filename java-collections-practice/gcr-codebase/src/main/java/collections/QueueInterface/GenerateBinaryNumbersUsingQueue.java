package collections.QueueInterface;
import java.util.*;

public class GenerateBinaryNumbersUsingQueue {
	public static void generateBinaryNumbers(int n) {
		Queue<String> queue = new LinkedList<>();
		queue.add("1");

		for (int i = 0; i < n; i++) {
			String currentBinary = queue.poll();
			System.out.println(currentBinary);

			queue.add(currentBinary + "0");
			queue.add(currentBinary + "1");
		}
	}

	public static void main(String[] args) {
		int n = 10;
		generateBinaryNumbers(n);
	}

}
