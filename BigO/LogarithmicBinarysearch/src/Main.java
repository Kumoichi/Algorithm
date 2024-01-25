//binary search is logarithmic because it reduces the search space by half everytime.

public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetElement = 5;

        int resultIndex = binarySearch(targetElement, sortedArray, 0, sortedArray.length - 1);

        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    private static int binarySearch(int target, int[] array, int start, int end) {
        if (start > end) {
            // Base case: Element not found
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == array[mid]) {
            // Base case: Element found at mid
            return mid;
        } else if (target < array[mid]) {
            // Recursive case: Search in the left half
            return binarySearch(target, array, start, mid - 1);
        } else {
            // Recursive case: Search in the right half
            return binarySearch(target, array, mid + 1, end);
        }
    }
}
