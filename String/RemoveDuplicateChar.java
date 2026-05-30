import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                newStr.append(ch);
            } else if (newStr.toString().toLowerCase().indexOf(Character.toLowerCase(ch)) == -1) {
                newStr.append(ch);
            }
        }

        System.out.println(newStr);
        sc.close();
    }
}
