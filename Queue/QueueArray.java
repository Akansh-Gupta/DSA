public class QueueArray {
    int front = -1, rear = -1;
    void enqueueElem(int arr[], int data){
        if(front == arr.length){
            System.out.println("Queue full");
            return;
        }
        if(front !=-1 && rear != -1){
            arr[++rear] = data;
        }else{
            arr[++rear] = data;
            front++;
        }
    }

    int dequeueElem(int arr[]){
        if(rear == -1){
            System.out.println("\nQueue already empty");
            return -1;
        }
        return arr[front++];
    }

    void display(int arr[]){
        int temp = front;
        while(temp <= rear){
            System.out.print(arr[temp++] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        int n = 50;
        int arr[] = new int[n];
        q.enqueueElem(arr, 10);
        q.enqueueElem(arr, 20);
        q.enqueueElem(arr, 30);
        q.enqueueElem(arr, 40);
        q.enqueueElem(arr, 50);
        q.enqueueElem(arr, 60);
        q.enqueueElem(arr, 70);
        q.display(arr);
        System.out.println("Dequeued : " + q.dequeueElem(arr));
        System.out.println("Dequeued : " + q.dequeueElem(arr));
        q.display(arr);
    }
}
