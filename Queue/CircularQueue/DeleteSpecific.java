import java.util.Scanner;

public class DeleteSpecific {
    static void deleteSpecific(CircularQueueLinkedList q, int num) {
        if (q.front == null)
            return;
        CircularQueueNode curr = q.front;
        CircularQueueNode prev = q.front;
        do {
            if (curr.data == num) {
                // Only one node
                if (curr == q.front && curr == q.rear) {
                    q.front = q.rear = null;
                }
                // Front node
                else if (curr == q.front) {
                    q.front = q.front.next;
                    q.rear.next = q.front;
                }
                // Rear node
                else if (curr == q.rear) {
                    prev.next = q.front;
                    q.rear = prev;
                }
                // Middle node
                else {
                    prev.next = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != q.front);
    }

    public static void main(String[] args) {
        CircularQueueLinkedList q = new CircularQueueLinkedList();
        q.enqueueElem(10);
        q.enqueueElem(20);
        q.enqueueElem(30);
        q.enqueueElem(40);
        q.enqueueElem(50);
        q.enqueueElem(60);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int num = sc.nextInt();

        deleteSpecific(q, num);

        q.printQueue();

        sc.close();
    }
}
