import java.util.*;

class queue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.add(60);
        q.remove();
        q.remove();
        System.err.println("final:" + q);

    }
}
