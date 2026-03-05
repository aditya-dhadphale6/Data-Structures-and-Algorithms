/*
Problem:
Sort an array using the Bubble Sort algorithm.

Explanation:
Bubble Sort repeatedly compares adjacent elements and swaps them
if they are in the wrong order. After each pass, the largest element
"bubbles up" to its correct position at the end of the array.

Approach:
1. Traverse the array multiple times.
2. Compare adjacent elements.
3. Swap them if the current element is greater than the next.
4. After each pass, the largest element gets placed at the end.

Time Complexity:
Worst/Average: O(n^2)
Best Case: O(n) (if optimized with swap check)

Space Complexity:
O(1)
*/

public class BubbleSort {

    // Function to perform Bubble Sort
    public static void bubbleSort(int[] numbers) {

        int arrayLength = numbers.length;

        // Outer loop controls the number of passes
        for (int pass = 0; pass < arrayLength - 1; pass++) {

            // Inner loop compares adjacent elements
            for (int index = 0; index < arrayLength - pass - 1; index++) {

                // If current element is greater than next element
                if (numbers[index] > numbers[index + 1]) {

                    // Swap the elements
                    int temporary = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temporary;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("Original Array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}