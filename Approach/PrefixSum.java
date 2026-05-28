// Implement a program that reads an array of int, builds a prefix sum array and then ans in range sum query
import java.util.*;
class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        // Make a prefix array with its element as the sum of all the previous elements on the array index wise
        int prefix[] = new int[50];
        prefix[0] = 0;
        for(int i=1;i<=n;i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = prefix[r] - prefix[l-1];
        System.out.println(sum);
        sc.close();
    }    
}