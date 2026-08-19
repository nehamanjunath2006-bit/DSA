
import java.util.Stack;

class Solution {

    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String element = operations[i];

            // Number
            if (!element.equals("C")
                    && !element.equals("D")
                    && !element.equals("+")) {

                st.push(Integer.parseInt(element));
            } // C → remove previous score
            else if (element.equals("C")) {

                st.pop();
            } // D → double previous score
            else if (element.equals("D")) {

                int prod = st.peek() * 2;
                st.push(prod);
            } // + → add previous two scores
            else {

                int last = st.peek();
                st.pop();

                int secondLast = st.peek();

                int add = last + secondLast;

                st.push(last);
                st.push(add);
            }
        }

        // Calculate total
        int total = 0;

        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }

    public static void main(String[] args) {

        String[] operations = {"5", "-2", "4", "C", "D", "9", "+"};

        Solution obj = new Solution();

        int result = obj.calPoints(operations);

        System.out.println("Total Score = " + result);
    }
}
