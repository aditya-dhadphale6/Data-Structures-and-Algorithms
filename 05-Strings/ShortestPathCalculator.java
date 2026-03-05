/*
Problem:
Given a string representing directions (N, S, E, W),
calculate the shortest distance from the starting
point (0,0) to the final destination.

Example:
Input  : "WNEENESENNN"
Output : 5.0

Explanation:
We move on a 2D coordinate plane.
After processing all directions, we calculate
the direct distance from origin using:

distance = √(x² + y²)
*/

public class ShortestPathCalculator {

    // Function to calculate shortest distance from origin
    public static float calculateShortestDistance(String directions) {

        // Starting position (origin)
        int currentXPosition = 0;
        int currentYPosition = 0;

        // Loop through each direction in the string
        for (int index = 0; index < directions.length(); index++) {

            // Get current direction character
            char currentDirection = directions.charAt(index);

            // Move South → decrease Y coordinate
            if (currentDirection == 'S') {
                currentYPosition--;
            }

            // Move North → increase Y coordinate
            else if (currentDirection == 'N') {
                currentYPosition++;
            }

            // Move West → decrease X coordinate
            else if (currentDirection == 'W') {
                currentXPosition--;
            }

            // Move East → increase X coordinate
            else if (currentDirection == 'E') {
                currentXPosition++;
            }
        }

        // Calculate square of coordinates
        int xSquare = currentXPosition * currentXPosition;
        int ySquare = currentYPosition * currentYPosition;

        // Apply Euclidean distance formula
        float shortestDistance = (float) Math.sqrt(xSquare + ySquare);

        // Return the result
        return shortestDistance;
    }

    public static void main(String[] args) {

        // Example path
        String routeDirections = "WNEENESENNN";

        // Calculate and print the shortest distance
        float resultDistance = calculateShortestDistance(routeDirections);

        System.out.println("Shortest Distance from Origin: " + resultDistance);
    }
}