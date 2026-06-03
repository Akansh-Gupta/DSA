public class DetectLoop {
    static boolean detectLoop(SinglyLinkedList list) {
        if (list.head == null || list.head.next == null)
            return false;
        SinglyNode fast = list.head.next;
        SinglyNode slow = list.head;

        while (fast != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // List with loop
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Creating loop
        int loopPos = 4;
        SinglyNode temp = list.head;
        SinglyNode loopNode = list.head;
        for (int i = 1; i < loopPos; i++) {
            loopNode = loopNode.next;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = loopNode;
        if(detectLoop(list)){
            System.out.println("List contains a loop");
        }else{
            System.out.println("List doesn't contain a loop");
        }

        // List with loop
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.insertAtEnd(100);
        list1.insertAtEnd(200);
        list1.insertAtEnd(300);
        list1.insertAtEnd(400);
        list1.insertAtEnd(500);
        if(detectLoop(list1)){
            System.out.println("List contains a loop");
        }else{
            System.out.println("List doesn't contain a loop");
        }
    }
}
