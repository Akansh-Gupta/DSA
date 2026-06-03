public class SinglyCircularLinkedList {
    SinglyCircularNode head;

    void insert(int data) {
        SinglyCircularNode newnode = new SinglyCircularNode(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }
        SinglyCircularNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }

    void delete() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        SinglyCircularNode temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    void update(int oldval, int newval) {
        if (head == null) {
            System.out.println(oldval + " doesn't exist in list");
            return;
        }
        SinglyCircularNode temp = head;
        do {
            if (temp.data == oldval) {
                temp.data = newval;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println(oldval + " doesn't exist in list");
    }

    void printList(SinglyCircularLinkedList list) {
        SinglyCircularNode temp = list.head;
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp!= head);
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.printList(list);
        System.out.println();

        list.delete();
        list.printList(list);
        System.out.println();

        list.update(20, 200);
        list.printList(list);
        System.out.println();
    }
}
