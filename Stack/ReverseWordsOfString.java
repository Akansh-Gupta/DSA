import java.util.*;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ' || i==str.length()-1){
                if(i==str.length()-1) st.push(ch);
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }else{
                st.push(ch);
            }
        }
        sc.close();
    }
}
