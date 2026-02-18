package stack;

/**
 * A generic Stack.Stack implementation using a fixed-size Object array.
 * @param <T> the type of elements held in this stack
 */
public class Stack<T> {
    private Object[] elements;
    private int top = -1;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Default constructor initializing the stack with a default capacity.
     */
    public Stack() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Constructor initializing the stack with a custom capacity.
     * @param capacity the maximum size of the stack
     */
    public Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    /**
     * Pushes an item onto the top of the stack.
     * @param item the element to be added
     * @throws StackFullException if the array is full
     */
    public void push(T item) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack.Stack is full. Cannot push: " + item);
        }
        elements[++top] = item;
    }

    /**
     * Removes and returns the object at the top of the stack.
     * @return the element at the top
     * @throws StackEmptyException if the stack contains no elements
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack.Stack is empty. Cannot pop.");
        }
        T item = (T) elements[top];
        elements[top--] = null; // Clear reference for GC
        return item;
    }

    /**
     * Looks at the object at the top of the stack without removing it.
     * @return the element at the top
     * @throws StackEmptyException if the stack contains no elements
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack.Stack is empty. Cannot peek.");
        }
        return (T) elements[top];
    }

    /**
     * Concatenates all elements into a string separated by ';'.
     * @return a formatted string of stack contents
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}