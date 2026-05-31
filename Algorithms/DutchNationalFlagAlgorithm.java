import java.util.Scanner;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter values (0,1,2): ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int l = 0, m = 0, h = n - 1;
        while (m <= h) {
            if (arr[m] == 0) {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++; m++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
>>>>>>> 37bfcc5232fe899e6c5529247ba75493463f4e63
