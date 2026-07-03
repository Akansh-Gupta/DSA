import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStack {
    Deque<Integer> st1 = new ArrayDeque<>();
    Deque<Integer> st2 = new ArrayDeque<>();

    public void push(int x){
        st1.push(x);
    }
    public int pop(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    public int peek(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }

    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }

    public static void main(String[] args) {
        
    }
}
