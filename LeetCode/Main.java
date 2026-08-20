
import java.util.*;

public class Main {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater element for every number in nums2
        for (int num : nums2) {

            while (!st.isEmpty() && st.peek() < num) {
                int smallest = st.pop();
                map.put(smallest, num);
            }

            st.push(num);
        }

        // Create result for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
