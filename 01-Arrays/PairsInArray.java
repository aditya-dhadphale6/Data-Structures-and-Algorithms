import java.util.Scanner;

/*
------------------------------------------------------------
PROBLEM: Pairs in an Array
------------------------------------------------------------

Given an array of integers, print all unique pairs of elements.

Example:
Input:  [1, 2, 3, 4]

Output:
(1,2) (1,3) (1,4)
(2,3) (2,4)
(3,4)

------------------------------------------------------------
APPROACH
------------------------------------------------------------

1. Traverse the array using two loops.
2. The outer loop selects the first element of the pair.
3. The inner loop selects the second element.
4. To avoid duplicate pairs and self-pairs:
   - Start the inner loop from (i + 1)
5. Print each pair.

------------------------------------------------------------
TIME COMPLEXITY
------------------------------------------------------------
O(n²)  → because we use two nested loops

SPACE COMPLEXITY
------------------------------------------------------------
O(1)  → no extra space used
------------------------------------------------------------
*/

public class PairsInArray {

    /*
     ------------------------------------------------------------
     METHOD: printArrayPairs
     PURPOSE: Prints all unique pairs present in the array
     ------------------------------------------------------------
    */
    public static void printArrayPairs(int[] numbers) {

        // Step 1: Traverse the array using the outer loop
        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {

            // Step 2: Inner loop starts from the next element
            // This avoids duplicate pairs like (1,1)
            for (int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++) {

                // Step 3: Print the pair
                System.out.print("(" + numbers[firstIndex] + ", " + numbers[secondIndex] + ") ");
            }

            // Move to next line after each outer loop iteration
            System.out.println();
        }
    }


    /*
     ------------------------------------------------------------
     MAIN METHOD
     PURPOSE:
     1. Take user input
     2. Store values in an array
     3. Call the method to print pairs
     ------------------------------------------------------------
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user for array size
        System.out.print("Enter the length of the array: ");
        int arraySize = scanner.nextInt();

        // Step 2: Create the array
        int[] numbers = new int[arraySize];

        // Step 3: Take array input from the user
        for (int index = 0; index < arraySize; index++) {
            System.out.print("Enter value at index " + index + ": ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("\nPairs in the array:");

        // Step 4: Call the method to print pairs
        printArrayPairs(numbers);

        scanner.close();
    }
}