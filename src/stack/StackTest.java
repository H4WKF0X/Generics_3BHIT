package stack;

public class StackTest {
    public static void main(String[] args) {
        System.out.println("Testing Integer Stack.Stack");
        Stack<Integer> numStack = new Stack<>(3);
        try {
            numStack.push(10);
            numStack.push(20);
            numStack.push(30);
            System.out.println("Current Stack.Stack: " + numStack.list());

            System.out.println("Peek: " + numStack.peek());
            System.out.println("Pop: " + numStack.pop());
            System.out.println("Stack.Stack after pop: " + numStack.list());

            numStack.push(40);
            numStack.push(50);
        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        System.out.println("\nTesting String Stack.Stack");
        Stack<String> textStack = new Stack<>(5);
        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");
            System.out.println("Text List: " + textStack.list());

            textStack.pop();
            textStack.pop();
            textStack.pop();
            textStack.pop();
        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }
    }
}