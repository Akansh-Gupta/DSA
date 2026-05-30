import java.util.Scanner;

public class LongestConsecutiveIncSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 1, curLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                curLen++;
            else
                curLen = 1;
            if (maxLen < curLen)
                maxLen = curLen;
        }
        System.out.println("Longest consecutive increasing sub-array = " + maxLen);
        sc.close();
    }
}
