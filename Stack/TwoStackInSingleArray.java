public class TwoStackInSingleArray {
    int n = 5; // Size of stack
    int arr[] = new int[n];
    int top1 = -1;
    int top2 = n;

    void push1(int data) {
        if (top1 + 1 == top2) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top1] = data;
    }

    void push2(int data){
        if(top1 + 1 == top2){
            System.out.println("Stack overflow");
            return;
        }
        arr[--top2] = data;
    }

    int pop1(){
        if(top1 == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        arr[top1] = 0;
        return arr[top1--];
    }

    int pop2(){
        if(top2 == n){
            System.out.println("Stack underflow");
            return -1;
        }
        arr[top2] = 0;
        return arr[top2++];
    }

    void display(){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        TwoStackInSingleArray st = new TwoStackInSingleArray();
        st.push1(10);
        st.push1(20);
        st.push1(30);
        st.push2(100);
        st.push2(200);
        st.display();
        System.out.println();

        st.pop1();
        st.pop2();
        st.display();
    }
}