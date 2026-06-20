import java.util.Scanner;

public class MinWindowSubstring {
    static boolean contain(int s[], int t[]) {
        for (int i = 0; i < 256; i++) {
            if (t[i] > s[i])
                return false;
        }
        return true;
    }

    static String minWindow(String s, String t) {
        int l = 0, r, min = Integer.MAX_VALUE, start = 0;
        int freqS[] = new int[256];
        int freqT[] = new int[256];
        for (int i = 0; i < t.length(); i++) {
            freqT[t.charAt(i)]++;
        }
        for (r = 0; r < s.length(); r++) {
            freqS[s.charAt(r)]++;
            while (contain(freqS, freqT)) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                freqS[s.charAt(l++)]--;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter Target : ");
        String target = sc.nextLine();
        System.out.println("Min window substring : " + minWindow(str, target));
        sc.close();
    }
}