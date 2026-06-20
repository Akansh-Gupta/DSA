import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacter {
    static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        System.out.println("Length of longest substring without repeating characters : " + longestSubstring(s));
        sc.close();
    }
}
