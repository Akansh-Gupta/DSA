public class SinglyLinkedList {
    Node head;

    void insertAtBegin(int data) {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    void insertAtPos(int data, int pos) {
        Node newnode = new Node(data);
        Node temp = head;
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }
        int curpos = 1;
        while (temp != null && curpos < pos - 1) {
            temp = temp.next;
            curpos++;
        }
        if (temp == null) {
            System.out.println("Cannot insert element. Invalid position.");
        } else {
            newnode.next = temp.next;
            temp.next = newnode;
        }

    }

    void insertAtEnd(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void deleteBeginning() {
        head = head.next;
    }

    void deleteEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteFromPos(int pos) {
        Node temp = head;
        int curpos = 1;
        while (temp != null && curpos < pos - 1) {
            temp = temp.next;
            curpos++;
        }
        if (temp == null) {
            System.out.println("Cannot delete element. Invalid position.");
        } else {
            temp.next = temp.next.next;
        }
    }

    void update(int oldval, int newval) {
        Node temp = head;
        while (temp != null && temp.data != oldval) {
            temp = temp.next;
        }
        if(temp==null){
            System.out.println(oldval + "doesn't exist in list");
        }else{
            temp.data = newval;
        }
    }

    void printList(SinglyLinkedList list) {
        Node temp = list.head;
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.printList(list);
        System.out.println();

        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.insertAtEnd(400);
        list.printList(list);
        System.out.println();

        list.insertAtPos(1000, 3);
        list.printList(list);
        System.out.println();

        list.deleteBeginning();
        list.printList(list);
        System.out.println();

        list.deleteEnd();
        list.printList(list);
        System.out.println();

        list.deleteFromPos(3);
        list.printList(list);
        System.out.println();
        
        list.update(200, 2000);
        list.printList(list);
        System.out.println();

    }
}
