public class CloneLinkedList {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
        }
    }

    // Clone the linked list
    public static Node cloneList(Node head) {
        if (head == null)
            return null;

        // Step 1: Insert cloned nodes in between original nodes
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Copy random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        // Step 3: Separate original and cloned lists
        curr = head;
        Node cloneHead = head.next;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;

            if (copy.next != null)
                copy.next = copy.next.next;

            curr = curr.next;
        }

        return cloneHead;
    }

    // Print list
    public static void printList(Node head) {
        while (head != null) {
            int randomData = (head.random != null) ? head.random.data : -1;
            System.out.println("Data = " + head.data +
                    ", Random = " + randomData);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Setting random pointers
        head.random = head.next.next;          // 1 -> 3
        head.next.random = head;               // 2 -> 1
        head.next.next.random = head.next.next.next; // 3 -> 4
        head.next.next.next.random = head.next; // 4 -> 2

        System.out.println("Original List:");
        printList(head);

        Node clone = cloneList(head);

        System.out.println("\nCloned List:");
        printList(clone);
    }
}