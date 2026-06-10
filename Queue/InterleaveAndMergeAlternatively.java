import java.util.Scanner;

public class InterleaveAndMergeAlternatively {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        QueueLinkedList firstHalf = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.enqueueElem(sc.nextInt());
        }
        q.display();
        for (int i = 0; i < n / 2; i++) {
            firstHalf.enqueueElem(q.dequeueElem());
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.print(firstHalf.dequeueElem() + " ");
                System.out.print(q.dequeueElem() + " ");
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                System.out.print(firstHalf.dequeueElem() + " ");
                System.out.print(q.dequeueElem() + " ");
            }
            System.out.print(q.dequeueElem() + " ");
        }
        sc.close();
    }
}
