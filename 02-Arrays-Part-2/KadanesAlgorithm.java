/*
Problem: Maximum Subarray Sum using Kadane's Algorithm

Goal:
Find the maximum sum of a contiguous subarray.

Idea:
Instead of checking every subarray, we keep a running sum.

Rules:
1. Add current element to currentSum
2. Update maxSum
3. If currentSum becomes negative, reset it to 0
   because negative sum will reduce future sums.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class KadanesAlgorithm {

    public static void kadane(int arr[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);

            // Reset if negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadane(arr);
    }
}