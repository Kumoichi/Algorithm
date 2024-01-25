public class Main {

    public static void main(String[] args) {
        int[] array = {10, 7, 3, 5, 2, 8, 4};
        int target = 5;

        int resultIndex = linearSearch(target, array);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    private static int linearSearch(int target, int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                return i; // Element found at index i
            }
        }

        return -1; // Element not found in the array
    }
}
