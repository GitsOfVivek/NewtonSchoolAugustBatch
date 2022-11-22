import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
  
        case '*':
        case '/':
            return 2;
  
        case '^':
            return 3;
        }
        return -1;
    }
  
    // The main method that converts
    // given infix expression
    // to postfix expression.
    public static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
  
        // initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
  
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
  
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
  
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
  
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
  
                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty()
                       && Prec(c) <= Prec(stack.peek())) {
  
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
  
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        
        return result;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(infixToPostfix(str));
    }
}
