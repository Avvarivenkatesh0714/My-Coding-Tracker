import java.util.*;

public class InfixToPrefixConversion {

    // Function to check if a character is an operator
    static boolean isOperator(char c) {
        return !Character.isLetterOrDigit(c);
    }

    // Function to return precedence of operators
    static int getPriority(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '^')
            return 3;
        return 0;
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String infix) {

        infix = "(" + infix + ")";
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                output.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            // Operator
            else {
                while (!stack.isEmpty() && isOperator(stack.peek())) {
                    if (ch == '^') {
                        if (getPriority(ch) <= getPriority(stack.peek()))
                            output.append(stack.pop());
                        else
                            break;
                    } else {
                        if (getPriority(ch) < getPriority(stack.peek()))
                            output.append(stack.pop());
                        else
                            break;
                    }
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    // Function to convert infix to prefix
    static String infixToPrefix(String infix) {

        // Reverse infix
        StringBuilder reversed = new StringBuilder(infix).reverse();

        // Swap '(' and ')'
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(')
                reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')')
                reversed.setCharAt(i, '(');
        }

        // Convert to postfix
        String postfix = infixToPostfix(reversed.toString());

        // Reverse postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {

        String s = "(p+q)*(c-d)";
        System.out.println("Infix Expression: " + s);
        System.out.println("Prefix Expression: " + infixToPrefix(s));
    }
}
