import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase();
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        System.out.print("First non-repeating character: ");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                break;
            }
        }
        sc.close();
    }
}
