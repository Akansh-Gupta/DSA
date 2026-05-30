import java.util.*;

public class ReplaceSubsequenceByChar {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();
        System.out.print("Enter Replacement Character: ");
        String ch = sc.nextLine();
        String res = str.replace(pattern, ch);
        System.out.println(res);
        sc.close();
    }
}