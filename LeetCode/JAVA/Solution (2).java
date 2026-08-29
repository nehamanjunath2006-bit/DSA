
import java.util.*;

public class Main {

    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!st.isEmpty() && nums[index] > nums[st.peek()]) {

                int previousIndex = st.pop();

                result[previousIndex] = nums[index];
            }

            if (i < n) {
                st.push(index);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] result = nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}
