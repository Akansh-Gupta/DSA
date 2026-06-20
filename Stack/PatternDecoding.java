import java.util.*;

public class PatternDecoding {
    public static void main(String[] args) {
        Stack<StringBuilder> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(char ch : s.toCharArray()){
            if (Character.isDigit(ch)) {
                n = n * 10 + (ch - '0');
            }
            else if (ch == '[') {
                num.push(n);
                str.push(sb);
                sb = new StringBuilder();
                n = 0;
            }
            else if (ch == ']') {
                int repeat = num.pop();
                StringBuilder temp = str.pop();

                for (int i = 0; i < repeat; i++) {
                    temp.append(sb);
                }

                sb = temp;
            }
            else {
                sb.append(ch);
            }
        }

        System.out.println(sb);
        sc.close();
    }
}