public class FindMiddle {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);

        System.out.print("List: ");
        list.printList(list);
        SinglyNode slow = list.head;
        SinglyNode fast = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle: " + slow.data);
    }
}
