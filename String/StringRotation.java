import java.util.*;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char ch = sc.next().toUpperCase().charAt(0);
        if(ch == 'R'){
            n = str.length()-n;
        }
        StringBuilder target = new StringBuilder(str.substring(0, n));
        StringBuilder rest = new StringBuilder(str.substring(n));
        target.reverse();
        rest.reverse();
        target.append(rest);
        target.reverse();
        System.out.println(target);
        sc.close();
    }
}
