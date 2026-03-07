/*
============================================================
Topic: Bubble Sort
============================================================

Concept Explanation:
Bubble Sort is one of the simplest sorting algorithms.

It works by repeatedly comparing adjacent elements in an
array and swapping them if they are in the wrong order.

During each pass through the array:

1. The largest unsorted element "bubbles up" to the end.
2. After the first pass, the largest element is placed correctly.
3. After the second pass, the second-largest element is placed correctly.
4. This process continues until the array becomes fully sorted.

------------------------------------------------------------

Time Complexity:

Best Case    : O(n)   (when array is already sorted)
Average Case : O(n²)
Worst Case   : O(n²)

Space Complexity:
O(1)  → In-place sorting algorithm

------------------------------------------------------------

Problem Statement:

Given an array of integers, sort the array in ascending
order using the Bubble Sort algorithm.

Example:

Input:
[5, 3, 8, 4, 2]

Output:
[2, 3, 4, 5, 8]

------------------------------------------------------------

Step-by-Step Working Example

Initial Array:
5 3 8 4 2

PASS 1
Compare 5 and 3 → swap
3 5 8 4 2

Compare 5 and 8 → no swap
3 5 8 4 2

Compare 8 and 4 → swap
3 5 4 8 2

Compare 8 and 2 → swap
3 5 4 2 8

Largest element (8) is now placed correctly.

PASS 2
Compare 3 and 5 → no swap
Compare 5 and 4 → swap
Compare 5 and 2 → swap

PASS 3
Continue until array becomes sorted.

Final Sorted Array:
2 3 4 5 8

============================================================
*/

public class BubbleSort {

    // Function to perform Bubble Sort
    public static void bubbleSort(int arr[]) {

        int n = arr.length;

        // Outer loop represents number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // If the current element is greater than the next element
                // swap them
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];        // store current value
                    arr[j] = arr[j + 1];      // move smaller value left
                    arr[j + 1] = temp;        // move larger value right
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Example array
        int arr[] = {5, 3, 8, 4, 2};

        System.out.println("Original Array:");
        printArray(arr);

        // Call Bubble Sort
        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}