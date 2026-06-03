public class DoublyLinkedList {
    DoublyNode head;

    void insert(int data) {
        DoublyNode newnode = new DoublyNode(data);
        if (head == null) {
            head = newnode;
            return;
        }
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }

    void printList(DoublyLinkedList list) {
        DoublyNode temp = list.head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp!=null);
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.printList(list);
    }
}
