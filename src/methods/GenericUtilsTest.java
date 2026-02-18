package methods;

public class GenericUtilsTest {
    public static void main(String[] args) {
        // Testing reverse method with Strings
        String[] words = {"Java", "is", "cool"};
        System.out.println("Original Strings: " + java.util.Arrays.toString(words));

        GenericUtils.reverse(words); // Reversing
        System.out.println("Reversed Strings: " + java.util.Arrays.toString(words));

        System.out.println();

        // Testing reverse method with Integers
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Numbers: " + java.util.Arrays.toString(numbers));

        GenericUtils.reverse(numbers);
        System.out.println("Reversed Numbers: " + java.util.Arrays.toString(numbers));

        System.out.println();

        // Testing sum method with different Number types
        Double[] doubleArray = {1.5, 2.5, 3.0};
        Integer[] intArray = {10, 20, 30};

        double doubleSum = GenericUtils.sum(doubleArray);
        double intSum = GenericUtils.sum(intArray);

        System.out.println("Sum of Doubles: " + doubleSum); // 7.0
        System.out.println("Sum of Integers: " + intSum);   // 60.0

        //GenericUtils.sum(words);
    }
}