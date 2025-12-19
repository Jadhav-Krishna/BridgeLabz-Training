import java.util.*;

class MultiDimensionalInsSingleDimension {
    // program to create a 2D Array and Copy the 2D Array into a single dimension array.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Take matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy 2D array into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print 1D array
        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
