import java.util.Scanner;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            list.insertAtEnd(sc.nextInt());
        }
        SinglyNode temp = list.head;
        SinglyNode temp1 = list.head.next;

        while (temp.next != null) {
            if (temp.data == temp1.data) {
                temp1 = temp1.next;
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        list.printList(list);
        sc.close();
    }
}
