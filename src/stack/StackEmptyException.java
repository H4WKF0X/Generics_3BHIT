package stack;

/**
 * Exception thrown when attempting to access an element from an empty stack.
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}