import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> st;

    public ImplementStackUsingQueue() {
        st = new LinkedList<>();
    }

    public void push(int x) {
        st.offer(x);
        for (int i = 1; i < st.size(); i++) {
            st.offer(st.poll());
        }
    }

    public int pop(){
        System.err.println("Popped element: " + st.peek());
        return st.poll();
    }

    public int top(){
        return st.peek();
    }

    public boolean isEmpty(){
        return st.size() > 0;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();
        
        System.out.println("Top element: " + stack.top());
    }
}