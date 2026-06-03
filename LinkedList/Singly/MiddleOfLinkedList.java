public class MiddleOfLinkedList {
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
        list.insertAtEnd(90);
        if (list.head == null) {
            System.out.println("Empty List");
        } else {
            SinglyNode fast = list.head;
            SinglyNode slow = list.head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            list.printList(list);
            System.out.println("Middle : " + slow.data);
        }
    }
}
