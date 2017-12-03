package leetcode;

import java.util.Stack;

public class P682 {

    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack();
         for (int i=0;i<ops.length;++i) {
            switch (ops[i]) {
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    sum += (first + second);
                    stack.push(first);
                    stack.push(first + second);
                    break;
                case "D":
                    int value = stack.peek();
                    sum += (value * 2);
                    stack.push(value*2);
                    break;
                case "C":
                    value = stack.pop();
                    sum -= value;
                    break;
                default:
                    int score = Integer.parseInt(ops[i]);
                    sum += score;
                    stack.push(score);
            }
        }
        return sum;
    }
}
