import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            sb.append(count);
            count = 1;
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
