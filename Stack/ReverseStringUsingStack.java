import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
        sc.close();
    }
}