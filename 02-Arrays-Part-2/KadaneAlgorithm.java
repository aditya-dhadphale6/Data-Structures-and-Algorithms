/*
Problem:
Find the maximum sum of a contiguous subarray using Kadane's Algorithm.

Explanation:
Kadane's Algorithm finds the maximum subarray sum efficiently by
tracking the current sum while traversing the array.

If the current sum becomes negative, we reset it to 0
because a negative sum will reduce future sums.

Approach:
1. Traverse the array.
2. Add the current element to currentSum.
3. Update maxSum if currentSum is greater.
4. If currentSum becomes negative, reset it to 0.

Time Complexity:
O(n)

Space Complexity:
O(1)
*/

public class KadaneAlgorithm {

    // Function to find maximum subarray sum
    public static int findMaximumSubarraySum(int[] numbers) {

        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int index = 0; index < numbers.length; index++) {

            currentSum = currentSum + numbers[index];

            // Update maximum sum
            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }

            // Reset if current sum becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maximumSum;
    }

    public static void main(String[] args) {

        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = findMaximumSubarraySum(numbers);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}