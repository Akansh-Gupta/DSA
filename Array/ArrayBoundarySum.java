import java.util.Scanner;

public class ArrayBoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        int sum = 0;
        System.out.println("Enter matrix elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
                if(i==0 || i==r-1 || j==0 || j==c-1) sum += mat[i][j]; 
            }
        }
        System.out.println("Sum of boundary elements = " + sum);
        sc.close();
    }    
}
