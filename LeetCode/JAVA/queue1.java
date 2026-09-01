
import java.util.*;

class queue1 {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // Queue → Stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        // Stack → Queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        System.out.println("Reversed Queue: " + q);
    }
}
