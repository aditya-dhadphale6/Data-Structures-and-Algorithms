/*
Problem: Maximum Subarray Sum (Brute Force)

Given an integer array, find the maximum sum of any contiguous subarray.

Approach:
1. Generate all possible subarrays using two loops.
2. Calculate the sum of each subarray using a third loop.
3. Keep track of the maximum sum encountered.

Time Complexity: O(n^3)
Space Complexity: O(1)
*/

public class MaxSubarraySumBruteForce {

    public static void maxSubarraySum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                int currentSum = 0;

                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};

        maxSubarraySum(arr);
    }
}