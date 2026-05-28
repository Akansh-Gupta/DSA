import java.util.Scanner;

public class DelRowWithHighestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of matrix r and c : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r+1][c+1];
        int sum[] = new int[r];
        int max = 0;
        System.out.println("Enter elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                sum[i] += mat[i][j]; 
            }
            if(sum[max] < sum[i]) max = i;
        }
        for (int i = max; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = mat[i+1][j];
            }
        }
        r--;
        System.out.println("Result : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
