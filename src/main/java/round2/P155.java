package round2;

import java.util.Stack;

/**
 * Created on 2018-03-20
 *
 * @author Jerry Shen
 */
public class P155 {

    private Stack<Integer> stack;

    private Stack<Integer> min;

    /** initialize your data structure here. */
    public P155() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty()) {
            min.push(x);
        } else {
            if (x <= min.peek()) {
                min.push(x);
            }
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
