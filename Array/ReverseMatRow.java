import java.util.Scanner;

public class ReverseMatRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        System.out.println("Enter 9 elements of matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) mat[i][j] = sc.nextInt();
        }
        System.out.println("Matrix in normal order :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix in row reverse order :");
        for(int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
