package round1;

import java.util.Stack;

public class P155 {
}

class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() > x)
            minStack.push(x);
    }

    public void pop() {
        int value = stack.pop();
        if (value == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
