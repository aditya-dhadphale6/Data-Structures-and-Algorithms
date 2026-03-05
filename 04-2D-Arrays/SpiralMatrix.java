/*
Problem:
Print elements of a 2D matrix in spiral order.

Explanation:
A spiral traversal prints the matrix layer by layer:

1. Print top row
2. Print right column
3. Print bottom row
4. Print left column

Then move inward and repeat until all elements are printed.

Example Matrix:

1  2  3
4  5  6
7  8  9

Spiral Output:
1 2 3 6 9 8 7 4 5

Time Complexity:
O(n * m)

Space Complexity:
O(1)
*/

public class SpiralMatrix {

    // Function to print matrix in spiral order
    public static void printSpiral(int[][] matrix) {

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // Print top row
            for (int column = startColumn; column <= endColumn; column++) {
                System.out.print(matrix[startRow][column] + " ");
            }

            // Print right column
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endColumn] + " ");
            }

            // Print bottom row
            for (int column = endColumn - 1; column >= startColumn; column--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][column] + " ");
            }

            // Print left column
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[row][startColumn] + " ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }
}