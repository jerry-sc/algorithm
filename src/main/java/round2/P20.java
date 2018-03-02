package round2;

import java.util.Stack;

public class P20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (ch == ')' && top == '(') {}
                else if (ch == '}' && top == '{'){}
                else if (ch == ']' && top == '[') {}
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
