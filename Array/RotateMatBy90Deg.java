//rotation = transpose + reverse

import java.util.Scanner;

public class RotateMatBy90Deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of nxn matrix : ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Reverse
        System.out.println("Rotated Matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//Matrix
// 1 2 3 
// 4 5 6
// 7 8 9

//Rotated matrix
// 7 4 1
// 8 5 2
// 9 6 3