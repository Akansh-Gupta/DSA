public class StackLinkedList {
    StackNode top;

    void push(int data) {
        StackNode newnode = new StackNode(data);
        newnode.next = top;
        top = newnode;
    }

    int pop() {
        StackNode temp = top;
        if (top == null)
            return -1;
        top = top.next;
        return temp.data;
    }

    void display() {
        StackNode temp = top;
        if (temp == null) {
            System.out.println("Empty stack");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    boolean isempty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        if (st.isempty())
            System.out.println("Empty Stack");
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        st.peek();

        st.pop();

        st.peek();
        st.push(100);

        st.peek();

        st.display();
    }
}
