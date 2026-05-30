import java.util.Scanner;

public class MatrixSpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        System.out.println("Enter the values of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int left = 0, right = c - 1, top = 0, bottom = r - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
            }
            left++;
        }
        sc.close();
    }
}
