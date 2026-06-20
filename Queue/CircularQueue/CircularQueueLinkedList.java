public class CircularQueueLinkedList {
    CircularQueueNode front;
    CircularQueueNode rear;
    void enqueueElem(int data){
        CircularQueueNode newnode = new CircularQueueNode(data);
        if(front == null){
            front = newnode;
            rear = newnode;
            newnode.next = front;
        }
        else{
            newnode.next = front;
            rear.next = newnode;
            rear = rear.next;
        }
    }

    int dequeueElem(){
        if(front == null){
            return -1;
        }
        CircularQueueNode temp = front;
        if(front == rear){
            front = rear = null;
            return temp.data;
        }
        else{
            //for array front = (front + 1) % SIZE    {SIZE = size of queue}
            front = front.next;
            rear.next = front;
            return temp.data;
        }
    }
    void printQueue(){
        CircularQueueNode temp = front;
        while(temp.next != front){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        CircularQueueLinkedList queue = new CircularQueueLinkedList();
        queue.enqueueElem(10);
        queue.enqueueElem(20);
        queue.enqueueElem(30);
        queue.enqueueElem(40);
        queue.enqueueElem(50);

        queue.printQueue();
    }
}