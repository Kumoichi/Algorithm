//it is simply accessing the index 2. so it is O(1) complexity

public class Main {

    public static void main(String[] args) {
        // Creating an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing an element by index (O(1) operation)
        int indexToAccess = 2;
        int result = getElementAt(indexToAccess, numbers);

        // Displaying the result
        System.out.println("Element at index " + indexToAccess + ": " + result);
    }

    // O(1) operation: Accessing an element in an array by index
    private static int getElementAt(int index, int[] array) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            // Handle index out of bounds, for simplicity, return a default value
            return -1;
        }
    }
}
