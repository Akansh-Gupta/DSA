import java.util.Scanner;
//Optimized approach
public class SegragateEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList even = new SinglyLinkedList();
        SinglyLinkedList odd = new SinglyLinkedList();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.insertAtBegin(data);
            if(data%2==0){
                even.insertAtEnd(data);
            }
            else{
                odd.insertAtEnd(data);
            }
        }
        SinglyNode evenTail = even.head;
        SinglyNode oddHead = even.head;
        while (evenTail.next!=null) {
            evenTail = evenTail.next;
        }
        evenTail.next = oddHead;
        even.printList(list);
        // list.printList(list);
        sc.close();
    }
}