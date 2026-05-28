import java.util.Arrays;
import java.util.Scanner;

public class VoteCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0, threshold = n/4;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]==arr[i]){
                count++;
                if(count > threshold){
                    System.out.println(arr[i]);
                    break;
                }
            }
            else count = 0;
        }
        sc.close();
    }
}

// insert and and delete row and col at specific index