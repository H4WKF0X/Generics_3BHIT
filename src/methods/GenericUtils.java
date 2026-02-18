package methods;
/**
 * Utility class providing generic operations for arrays.
 */
public class GenericUtils {

    /**
     * Reverses the elements of an array in-place.
     * @param <T>   The generic type of the array
     * @param array The array to be reversed
     */
    public static <T> void reverse(T[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers toward the middle
            start++;
            end--;
        }
    }

    /**
     * Calculates the sum of all elements in a numeric array.
     * Restricted to types that extend java.lang.Number.
     * * @param <T>   A type that is a subclass of Number
     * @param array The array of numbers to sum
     * @return The sum as a double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0;
        if (array == null) {
            return total;
        }

        for (T element : array) {
            if (element != null) {
                // Convert the number to double for calculation
                total += element.doubleValue();
            }
        }
        return total;
    }
}