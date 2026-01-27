package exceptionHandling;
import java.util.*;
import java.io.*;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("array size: ");
			int size = scanner.nextInt();
			Integer[] array = null;
			if (size > 0) {
				array = new Integer[size];
				for (int i = 0; i < size; i++) {
					System.out.print("element " + i + ": ");
					array[i] = scanner.nextInt();
				}
			}
			System.out.print("index to retrieve: ");
			int index = scanner.nextInt();
			System.out.println("Value at index " + index + ": " + array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index!");
		} catch (NullPointerException e) {
			System.out.println("Array is not initialized!");
		} finally {
			scanner.close();
		}

	}

}
