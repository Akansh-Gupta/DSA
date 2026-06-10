// Count number of ticket in queue problem
import java.util.*;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int tickets = sc.nextInt();
            q.add(tickets);
            sum += tickets;
        }
        System.out.print("Queue: ");
        for(int i : q){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("No. of tickets: " + sum);
        sc.close();
    }
}
