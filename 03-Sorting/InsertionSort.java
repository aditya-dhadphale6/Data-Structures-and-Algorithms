/*
============================================================
Topic: Insertion Sort
============================================================

Concept Explanation:

Insertion Sort is a simple sorting algorithm that builds
the final sorted array one element at a time.

It works similar to the way we sort playing cards in hand.

We take one element at a time and insert it into its
correct position in the already sorted part of the array.

The algorithm maintains two parts:

1. Sorted part (left side)
2. Unsorted part (right side)

At each step:
- Take the next element from the unsorted part
- Compare it with elements in the sorted part
- Shift elements to the right
- Insert the element at the correct position

------------------------------------------------------------

Time Complexity

Best Case    : O(n)     (already sorted array)
Average Case : O(n²)
Worst Case   : O(n²)

Space Complexity

O(1) → In-place sorting algorithm

------------------------------------------------------------

Problem Statement

Given an array of integers, sort the array in ascending
order using the Insertion Sort algorithm.

Example

Input:
[12, 11, 13, 5, 6]

Output:
[5, 6, 11, 12, 13]

------------------------------------------------------------

Step-by-Step Example

Initial Array:
12 11 13 5 6

PASS 1
Key = 11
Compare with 12 → shift 12

11 12 13 5 6

PASS 2
Key = 13
Already greater than previous → no shift

11 12 13 5 6

PASS 3
Key = 5
Shift 13, 12, 11

5 11 12 13 6

PASS 4
Key = 6
Shift 13, 12, 11

5 6 11 12 13

Final Sorted Array:
5 6 11 12 13

============================================================
*/

public class InsertionSort {

    // Function to perform Insertion Sort
    public static void insertionSort(int arr[]) {

        int n = arr.length;

        // Start from second element since first is already considered sorted
        for (int i = 1; i < n; i++) {

            int key = arr[i];     // element to be inserted
            int j = i - 1;

            // Move elements greater than key
            // one position ahead
            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];  // shift element right
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    // Function to print array
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}