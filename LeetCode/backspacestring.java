
import java.util.Stack;

class Solution {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c != '#') {
                st.push(c);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }

        for (char c : t.toCharArray()) {

            if (c != '#') {
                st1.push(c);
            } else if (!st1.isEmpty()) {
                st1.pop();
            }
        }

        return st.equals(st1);
    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        Solution obj = new Solution();

        boolean result = obj.backspaceCompare(s, t);

        System.out.println("Result: " + result);
    }
}
