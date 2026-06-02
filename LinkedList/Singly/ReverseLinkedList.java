public class ReverseLinkedList {
    static void reverse(SinglyLinkedList list) {
        Node prev = null;
        Node next = null;
        Node curr = list.head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        reverse(list);

        list.printList(list);
    }
}
