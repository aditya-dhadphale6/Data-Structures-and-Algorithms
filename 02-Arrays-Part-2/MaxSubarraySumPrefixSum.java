/*
Problem: Maximum Subarray Sum using Prefix Sum

Goal:
Find the maximum sum of any contiguous subarray.

Concept:
Prefix Sum helps us compute subarray sums in constant time.

prefix[i] = sum of elements from index 0 to i

Subarray Sum Formula:
sum(start → end) = prefix[end] - prefix[start - 1]

Time Complexity: O(n²)
Space Complexity: O(n)
*/

public class MaxSubarraySumPrefixSum {

    // Function to compute maximum subarray sum
    public static void maxSubarraySum(int arr[]) {

        int n = arr.length;

        // Step 1: Create prefix array
        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Step 2: Generate all subarrays
        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                int currentSum;

                // Step 3: Calculate subarray sum using prefix array
                if (start == 0) {
                    currentSum = prefix[end];
                } else {
                    currentSum = prefix[end] - prefix[start - 1];
                }

                // Step 4: Update max sum
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {

        int arr[] = {2, -3, 4, -1, -2, 1, 5, -3};

        maxSubarraySum(arr);
    }
}