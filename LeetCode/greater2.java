
import java.util.Arrays;
import java.util.Stack;

class greater2 {

    public static int[] nextGreaterElement(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] result = new int[arr.length];

        // Initially, assume every element has no greater element 
        Arrays.fill(result, -1);

        // Traverse the array twice because it is circular 
        for (int i = 0; i < 2 * arr.length; i++) {

            int current = arr[i % arr.length];

            // Keep popping while current is greater 
            while (!st.isEmpty() && arr[st.peek()] < current) {

                result[st.peek()] = current;

                st.pop();
            }

            // Push indexes only during the first traversal 
            if (i < arr.length) {
                st.push(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};

        int[] answer = nextGreaterElement(arr);

        System.out.println(Arrays.toString(answer));
    }
}
