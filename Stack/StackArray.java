public class StackArray {
    int top = -1;

    void push(int a[], int data) {
        if(top == a.length-1){
            System.out.println("Overflow");
            return;
        }
        a[++top] = data;
    }

    void pop(int a[]) {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Popped: " + a[top--]);
    }

    int peek(int a[]) {
        if (top == -1) {
            System.out.println("Stack empty");
            return -1;
        }
        return a[top];
    }

    void display(int a[]) {
        int temp = top;
        if (top == -1) {
            System.out.println("Stack empty");
            return;
        }
        while (temp != -1)
            System.out.println(a[temp--]);
    }

    boolean isempty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArray st = new StackArray();
        int arr[] = new int[5];
        st.push(arr, 10);
        st.push(arr, 20);
        st.push(arr, 30);
        st.push(arr, 40);
        st.push(arr, 50);
        st.push(arr, 60);
        st.display(arr);
        st.pop(arr);
        st.display(arr);
        System.out.println("Top of stack: " + st.peek(arr));
    }
}
