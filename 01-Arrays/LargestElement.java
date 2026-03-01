public class LargestElement {

    // Method to find largest element in array
    public static int findLargest(int[] arr) {

        // Assume first element is largest
        int largest = arr[0];

        // Traverse array starting from index 1
        for (int i = 1; i < arr.length; i++) {

            // If current element is greater than largest
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        int result = findLargest(numbers);

        System.out.println("Largest element: " + result);
    }
}