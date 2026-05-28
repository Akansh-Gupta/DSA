import java.util.Scanner;

public class DelSmallestArrElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements : ");
        int s = 0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<arr[s]) s = i;
        }
        System.out.println("Initial array : ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSmallest = " + arr[s]);
        for(int i=s;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        n--;
        System.out.println("Array after deleting smallest element : ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
