import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(longestValidParentheses(str));
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> index = new Stack<>();
        index.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                st.push(c);
                index.push(i);
            }else { // closing bracket
                if(!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                    index.pop();
                    max = Math.max(max, i - index.peek());
                }else {
                    index.push(i);
                }
            }
        }
        return max;
    }
}
