import java.util.Scanner;

public class OccuranceCount {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(10);
        list.insertAtEnd(40);
        list.insertAtEnd(10);
        System.out.print("List :");
        list.printList(list);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        SinglyNode temp = list.head;
        if(temp == null){
            System.out.println("Empty list");
            sc.close();
            return;
        }
        while(temp != null){
            if(temp.data == n){
                count++;
            }
            temp = temp.next; 
        }
        System.out.println("No. if occurances: " + count);
        sc.close();
    }
}
