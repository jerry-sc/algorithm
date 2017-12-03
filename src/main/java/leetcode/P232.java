package leetcode;

import java.util.Stack;

public class P232 {

}

class MyQueue {

    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        int res = tmp.pop();
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        int res = tmp.peek();
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
