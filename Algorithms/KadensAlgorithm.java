import java.util.Scanner;

public class KadensAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum += arr[i];
            if(currSum > maxSum) maxSum = currSum;
            if(currSum < 0) currSum = 0;
        }
        System.out.println("Maximum sum: " + maxSum);
        sc.close();
    }
}
