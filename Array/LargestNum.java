import java.util.Scanner;

public class LargestNum {
    static int largestNum(int nums[]){
        int largest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest) largest = nums[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Largest number in array = " + largestNum(arr));
        sc.close();
    }
}
