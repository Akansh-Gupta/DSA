import java.util.Scanner;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine().toLowerCase();
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        System.out.print("Sorted String: ");
        for (int count = str.length(); count >= 1; count--) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] == count) {
                    for (int j = 0; j < count; j++) {
                        System.out.print((char)(i + 'a'));
                    }
                }
            }
        }
        sc.close();
    }
}
