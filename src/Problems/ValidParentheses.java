package Problems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean result = isValid("()[]");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for( char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{'|| ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (ch == ')' && open != '(') return false;
                if (ch == '}' && open != '{') return false;
                if (ch == ']' && open != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}