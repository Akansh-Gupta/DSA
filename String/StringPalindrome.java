import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i)!=rev.toLowerCase().charAt(i)){
                flag =  false;
                System.out.println(str + " is not a palindrome");
                break;
            }
        }
        if (flag) {
            System.out.println(str + " is a palindrome");
        }
        sc.close();
    }
}
