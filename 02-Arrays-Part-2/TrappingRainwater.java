/*
Problem: Trapping Rainwater

Given an array where each element represents the height of a bar,
compute how much water can be trapped after raining.

Concept:
Water trapped at any index depends on the minimum of:
1. Maximum height to the left
2. Maximum height to the right

Formula:
Water = min(leftMax, rightMax) - height[i]

Steps:
1. Compute leftMax array
2. Compute rightMax array
3. Calculate trapped water at each index

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class TrappingRainwater {

    public static int trapWater(int height[]) {

        int n = height.length;

        // Step 1: Create left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Create right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water
        int trappedWater = 0;

        for (int i = 0; i < n; i++) {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        int result = trapWater(height);

        System.out.println("Total Trapped Water = " + result);
    }
}