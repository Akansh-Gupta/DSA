import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[n];
        StackLinkedList st = new StackLinkedList();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isempty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isempty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + ans[i]);
        }
        sc.close();
    }
}
