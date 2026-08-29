
import java.util.Stack;

public class Solution {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.equals("+") || token.equals("-")
                    || token.equals("*") || token.equals("/")) {

                int b = st.pop();
                int a = st.pop();

                if (token.equals("+")) {
                    st.push(a + b);
                } else if (token.equals("-")) {
                    st.push(a - b);
                } else if (token.equals("*")) {
                    st.push(a * b);
                } else {
                    st.push(a / b);
                }

            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"4", "13", "5", "/", "+"};

        int answer = evalRPN(tokens);

        System.out.println("Answer = " + answer);
    }
}
