public class MergeSortedLists {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        SinglyLinkedList res = new SinglyLinkedList();

        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(40);
        l1.insertAtEnd(70);
        l1.insertAtEnd(90);
        l1.insertAtEnd(110);

        l2.insertAtEnd(30);
        l2.insertAtEnd(50);
        l2.insertAtEnd(80);
        l2.insertAtEnd(100);

        while (l1.head != null && l2.head != null) {
            if (l1.head.data < l2.head.data) {
                res.insertAtEnd(l1.head.data);
                l1.head = l1.head.next;
            } else {
                res.insertAtEnd(l2.head.data);
                l2.head = l2.head.next;
            }
        }
        while (l1.head != null) {
            res.insertAtEnd(l1.head.data);
            l1.head = l1.head.next;
        }

        while (l2.head != null) {
            res.insertAtEnd(l2.head.data);
            l2.head = l2.head.next;
        }
        res.printList(res);
    }
}