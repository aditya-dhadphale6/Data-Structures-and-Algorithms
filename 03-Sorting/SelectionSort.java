/*
============================================================
Topic: Selection Sort
============================================================

Concept Explanation:

Selection Sort is a simple sorting algorithm that repeatedly
selects the smallest element from the unsorted portion of the
array and places it at the beginning.

The algorithm divides the array into two parts:

1. Sorted portion (left side)
2. Unsorted portion (right side)

At every iteration:
- Find the smallest element in the unsorted section
- Swap it with the first element of the unsorted section

This process continues until the entire array becomes sorted.

------------------------------------------------------------

Time Complexity:

Best Case    : O(n²)
Average Case : O(n²)
Worst Case   : O(n²)

Selection Sort always scans the remaining array to find
the minimum element.

Space Complexity:
O(1) → In-place sorting algorithm

------------------------------------------------------------

Problem Statement:

Given an array of integers, sort the array in ascending
order using the Selection Sort algorithm.

Example:

Input:
[64, 25, 12, 22, 11]

Output:
[11, 12, 22, 25, 64]

------------------------------------------------------------

Step-by-Step Example

Initial Array:
64 25 12 22 11

PASS 1
Find minimum element in the array → 11
Swap with first element

11 25 12 22 64

PASS 2
Find minimum from remaining array

11 12 25 22 64

PASS 3
Find minimum from remaining

11 12 22 25 64

Array becomes sorted.

============================================================
*/

public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int arr[]) {

        int n = arr.length;

        // Outer loop moves the boundary of the sorted portion
        for (int i = 0; i < n - 1; i++) {

            // Assume current position has the smallest value
            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element
            // of the unsorted portion

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        int arr[] = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}