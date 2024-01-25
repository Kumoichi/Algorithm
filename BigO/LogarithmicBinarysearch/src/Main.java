//binary search is logarithmic because it reduces the search space by half everytime.


public class Main {

    public static void main(String[] args) {
        // Sorted array
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Element to search
        int targetElement = 5;

        // Perform binary search
        int resultIndex = binarySearch(sortedArray, targetElement);

        // Display the result
        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    // Binary search algorithm
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at the middle
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the target is not present in the array
        return -1;
    }
}
