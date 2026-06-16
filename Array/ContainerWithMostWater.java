import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        
        int l = 0, r = n-1, max = 0;
        while(l<r){
            int cur;
            if(a[l] < a[r]){
                cur = a[l] * (r-l);
                l++;
            } else{
                cur = a[r] * (r-l);
                r--;
            }
            if(cur > max) max = cur;
        }
        System.out.println("Result " + max);
        sc.close();
    }
}
