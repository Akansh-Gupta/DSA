public class SinglyToCircular {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        SinglyNode temp = list.head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        list.printList(list);
        if(temp.next == null){
            System.out.println(temp.data + "-> null");
        }
        temp.next = list.head;
        System.out.println("After conversion to circular linked list: " + temp.data + "->" + temp.next.data);
    }
}
