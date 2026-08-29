
import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {

        st.push(value);

        if (minSt.isEmpty()) {
            minSt.push(value);
        } else if (value <= minSt.peek()) {
            minSt.push(value);
        } else {
            minSt.push(minSt.peek());
        }
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }

    // For VS Code testing
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(2);
        obj.push(5);
        obj.push(4);
        obj.push(8);
        obj.push(1);

        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());

        obj.pop();

        System.out.println("After pop:");
        System.out.println("Top: " + obj.top());
        System.out.println("Minimum: " + obj.getMin());
    }
}
#leetcode solution
import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public MinStack() {
        
    }

    public void push(int value) {

        // Normal stack
        st.push(value);

        // Minimum stack
        if (minSt.isEmpty()) {
            minSt.push(value);
        }
        else if (value <= minSt.peek()) {
            minSt.push(value);
        }
        else {
            minSt.push(minSt.peek());
        }
    }

    public void pop() {

        st.pop();
        minSt.pop();
    }

    public int top() {

        return st.peek();
    }

    public int getMin() {

        return minSt.peek();
    }
}
