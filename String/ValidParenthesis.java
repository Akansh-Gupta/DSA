import java.util.*;

public class ValidParenthesis {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                    if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (top != map.get(ch)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isValid(s)) System.out.println("Valid parenthesis");
        else System.out.println("Invalid parenthesis");
        sc.close();
    }
}