package Week_10172022.Prompt2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class StackWithMax<T extends Comparable<T>>
{
    private List<T> stack;
    private List<T> maxStack; // tracks current max

    public StackWithMax()
    {
        stack = new ArrayList();
        maxStack = new ArrayList();
    }

    public void push(T value)
    {
        stack.add(value);

        if (maxStack.size() == 0)
        {
            maxStack.add(value);
            return;
        }

        T currentMax = maxStack.get(maxStack.size() - 1);
        if (value.compareTo(currentMax) > 0)
            maxStack.add(value);
        else
            maxStack.add(currentMax);
    }

    public T pop() {
        if (stack.size() == 0)
            throw new EmptyStackException();

        maxStack.remove(stack.size() - 1);
        return stack.remove(stack.size() - 1);
    }

    public T max() {
        if (maxStack.size() == 0)
            throw new EmptyStackException();

        return maxStack.get(maxStack.size() - 1);
    }
}
