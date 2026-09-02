
import java.util.*;

class Solution {

    public static void main(String[] args) {

        String s = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
