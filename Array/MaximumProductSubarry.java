import java.util.Scanner;

public class MaximumProductSubarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. elements: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int left = 1;
        int right = 1;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            left = (left == 0) ? 1 : left;
            right = (right == 0) ? 1 : right;
            left *= nums[i];
            right *= nums[n - 1 - i];
            ans = Math.max(ans, Math.max(left, right));
        }
        System.out.println("Maximum Product: " + ans);
        sc.close();
    };
}