/*
============================================================
Topic: Counting Sort
============================================================

Concept Explanation:

Counting Sort is a non-comparison based sorting algorithm.

Unlike Bubble, Selection, or Insertion sort which compare
elements, Counting Sort works by counting the number of
occurrences of each element.

It is useful when:
- The range of input values is small
- Elements are integers

The algorithm works in three main steps:

1. Find the maximum value in the array.
2. Create a counting array to store frequency of elements.
3. Reconstruct the sorted array using the count array.

------------------------------------------------------------

Time Complexity

Best Case    : O(n + k)
Average Case : O(n + k)
Worst Case   : O(n + k)

Where:
n = number of elements
k = range of input values

Space Complexity

O(k)

Counting Sort is NOT an in-place algorithm because it uses
an additional counting array.

------------------------------------------------------------

Problem Statement

Given an array of non-negative integers, sort the array
using the Counting Sort algorithm.

Example

Input:
[1, 4, 1, 3, 2, 4, 3, 7]

Output:
[1, 1, 2, 3, 3, 4, 4, 7]

------------------------------------------------------------

Step-by-Step Example

Input Array:
1 4 1 3 2 4 3 7

Step 1 — Find maximum element
Max = 7

Step 2 — Create count array (size max + 1)

Index: 0 1 2 3 4 5 6 7
Count: 0 2 1 2 2 0 0 1

Step 3 — Reconstruct array

1 appears 2 times
2 appears 1 time
3 appears 2 times
4 appears 2 times
7 appears 1 time

Final Sorted Array:
1 1 2 3 3 4 4 7

============================================================
*/

public class CountingSort {

    // Function to perform Counting Sort
    public static void countingSort(int arr[]) {

        int n = arr.length;

        // Step 1: Find maximum element
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int count[] = new int[max + 1];

        // Step 3: Store frequency of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Reconstruct sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                arr[index] = i;
                index++;

                count[i]--;
            }
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

        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.println("Original Array:");
        printArray(arr);

        countingSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}