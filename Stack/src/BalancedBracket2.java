import java.util.Stack;

public class BalancedBracket2 {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int j = 0; j < expression.length(); j++) {
            char i = expression.charAt(j);
            if (i == '[' || i == '{' || i == '(') {
                stack.push(i);
            } else if (i == ']' || i == '}' || i == ')') {
                if (stack.isEmpty())
                    return false;

                if (i == ']') {
                    if (stack.peek() != '[')
                        return false;
                    else
                        stack.pop();
                }

                else if (i == '}') {
                    if (stack.peek() != '{')
                        return false;
                    else
                        stack.pop();
                }

                else if (i == ')') {
                    if (stack.peek() != '(')
                        return false;
                    else
                        stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        System.out.print(isBalanced("()()((()))"));
    }
}
