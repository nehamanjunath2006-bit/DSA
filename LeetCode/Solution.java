
import java.util.*;

public class Solution {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty()
                    && temperatures[i] > temperatures[st.peek()]) {

                int previous_index = st.pop();

                result[previous_index] = i - previous_index;
            }

            st.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] temperatures = {
            73, 74, 75, 71, 69, 72, 76, 73
        };

        int[] result = dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }
}
