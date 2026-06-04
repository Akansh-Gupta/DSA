public class StackLinkedList {
    StackNode top;

    void push(int data) {
        StackNode newnode = new StackNode(data);
        newnode.next = top;
        top = newnode;
    }

    void pop() {
        if (top == null)
            System.out.println("Empty Stack");
        else {
            System.out.println("Popped : " + top.data);
            top = top.next;
        }
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

    void peek() {
        if (top == null)
            System.out.println("NULL");
        else
            System.out.println("Top of stack -> " + top.data);
    }

    boolean isempty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        if (st.isempty())
            System.out.println("Empty Stack");
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
