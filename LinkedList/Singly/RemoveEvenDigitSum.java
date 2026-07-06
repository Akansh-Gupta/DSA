import java.util.Scanner;

public class RemoveEvenDigitSum {

    // Function to calculate sum of digits
    static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.insertAtEnd(sc.nextInt());
        }

        // Remove matching nodes from the beginning
        while (list.head != null && digitSum(list.head.data) % 2 == 0) {
            list.head = list.head.next;
        }

        if (list.head != null) {
            SinglyNode temp = list.head;

            while (temp.next != null) {
                if (digitSum(temp.next.data) % 2 == 0) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }

        System.out.println("List after removing nodes whose digit sum is even:");
        list.printList(list);

        sc.close();
    }
}