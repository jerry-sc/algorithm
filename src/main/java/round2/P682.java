package round2;

import java.util.Stack;

public class P682 {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; ++i) {
            switch (ops[i]) {
                case "+":
                    int up = stack.pop();
                    int down = stack.peek();
                    stack.push(up);
                    stack.push(up + down);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        return sum;
    }
}
