import java.util.Scanner;

public class MatrixDiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += mat[i][i];
            d2 += mat[i][n - i - 1];
        }
        System.out.println("Difference of diagonals: " + (d1 - d2));
        sc.close();
    }
}
