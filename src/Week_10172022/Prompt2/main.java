package Week_10172022.Prompt2;
/*
2) Implement a stack that has the following methods:
• push ( val ) : push val onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.

Each method should run in constant time.
 */
public class main
{
    public static void main(String[] args)
    {
        StackWithMax<Integer> myStack = new StackWithMax();

        myStack.push(1);
        myStack.push(7);
        myStack.push(5);
        myStack.push(10);
        System.out.println("Current Max: " + myStack.max());
        System.out.println("Removed: " + myStack.pop());
        System.out.println("Current Max: " + myStack.max());
        System.out.println("Removed: " + myStack.pop());
        System.out.println("Removed: " + myStack.pop());
        System.out.println("Current Max: " + myStack.max());
        System.out.println("Removed: " + myStack.pop());
        System.out.println("Current Max: " + myStack.max());    // EmptyStackException
    }
}
