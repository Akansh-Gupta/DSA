import java.util.Scanner;

public class DiffBetweenFirstAndLastElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Difference between first and last element = " + (arr[0] - arr[n-1]));
        sc.close();
    }
}
