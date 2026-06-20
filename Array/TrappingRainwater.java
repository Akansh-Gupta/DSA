import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter heights : ");
        int height[] = new int[n];
        for (int i = 0; i < n; i++)
            height[i] = sc.nextInt();
        if (n == 0) {
            System.out.println("Total water : " + 0);
            sc.close();
            return;
        }
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        right[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(left[i], right[i]) - height[i];
        }
        System.out.println("Total water : " + total);
        sc.close();
    }
}