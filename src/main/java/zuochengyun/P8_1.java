package zuochengyun;

import java.util.Stack;

/**
 * Created on 2018-03-31
 *
 * @author Jerry Shen
 */
public class P8_1 {

    /**
     * 移除栈中最底下的元素
     * @param stack stack
     */
    public int getAndRemoveLastElement(Stack<Integer> stack) {
        int top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(top);
            return last;
        }
    }

    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        int lastElement = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(lastElement);
    }
}
