import java.util.Scanner;

public class DeleteEvenSumDigits {
    static boolean digitSumEven(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        if (sum % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            if (digitSumEven(data))
                continue;
            else
                list.insert(data);
        }
        list.printList(list);
        sc.close();
    }
}
