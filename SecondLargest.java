public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // No second largest (e.g., all elements same)
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20};

        int result = findSecondLargest(arr);

        if (result != -1) {
            System.out.println("Second Largest Element: " + result);
        } else {
            System.out.println("Second largest element does not exist.");
        }
    }
}