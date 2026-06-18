import java.util.Scanner;

public class ValidPalindrome {
    static boolean isPalindrome(String s){
        int f = 0, r = s.length()-1;
        while(f<r){
            while (f<r && !Character.isLetterOrDigit(s.charAt(f))) {
                f++;
            }
            while (f<r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if(Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            f++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("Valid Palindrome");
        }
        else{
            System.out.println("Not Valid Palindrome");
        }
        sc.close();
    }
}
