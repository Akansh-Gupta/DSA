import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                res += ch;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
