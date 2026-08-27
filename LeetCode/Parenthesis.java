
import java.util.Stack;

class Parenthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } // Closing bracket
            else {

                // No opening bracket available
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();

                // Check matching pair
                if ((top == '(' && ch == ')')
                        || (top == '[' && ch == ']')
                        || (top == '{' && ch == '}')) {

                    st.pop();

                } else {
                    return false;
                }
            }
        }

        // Everything matched only if Stack is empty
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        System.out.println(isBalanced(str));
    }
}
