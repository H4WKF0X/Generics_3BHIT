package stack;

/**
 * Exception thrown when attempting to add an element to a full stack.
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}