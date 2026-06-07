import java.util.Scanner;

public class RemoveEveryKthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);
        list.insertAtEnd(100);
        System.out.println("Initially: ");
        list.printList(list);
        SinglyNode curr = list.head;
        SinglyNode prev = null;
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        int count = 1;
        if(list.head == null && k <= 0){
            sc.close();
            return;
        }

        if(k == 1){
            list.head = null;
            sc.close();
            return;
        }
        
        while(curr != null){
            if(count % k == 0){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
            count++;
        }
        System.out.println("After deleting each kth nodes");
        list.printList(list);
        sc.close();
    }
}
