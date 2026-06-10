public class QueueLinkedList {
    QueueNode front;
    QueueNode rear;

    void enqueueElem(int data) {
        QueueNode newnode = new QueueNode(data);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = rear.next;
        }
    }

    int dequeueElem() {
        if (front == null) {
            return -1;
        }
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        return data;
    }

    void display() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueueElem(10);
        q.enqueueElem(20);
        q.enqueueElem(30);
        q.enqueueElem(40);
        q.enqueueElem(50);
        q.enqueueElem(60);
        q.enqueueElem(70);
        q.display();
    }
}
