import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String prefix = "";
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }
        Arrays.sort(str);
        for (int i = 0; i < str[0].length(); i++) {
            if (str[0].charAt(i) == str[n - 1].charAt(i)) {
                prefix += str[0].charAt(i);
            } else
                break;
        }
        if(!prefix.isEmpty()){
            System.out.println("Longest common prefix: " + prefix);
        }else{
            System.out.println("No common prefix");
        }
        sc.close();
    }
}
