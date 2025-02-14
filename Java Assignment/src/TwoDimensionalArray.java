public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = array.length;
        int cols = array[0].length;

        // Calculate sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Calculate sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for(int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}
