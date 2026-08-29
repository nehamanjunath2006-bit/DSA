
import java.util.Stack;
import java.util.Arrays;

class stackspan {

    public static int[] stockSpan(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = i + 1;
            } else {
                result[i] = i - st.peek();
            }

            st.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        System.out.println(Arrays.toString(stockSpan(arr)));
    }
}
