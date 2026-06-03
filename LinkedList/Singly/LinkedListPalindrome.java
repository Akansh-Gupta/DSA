import java.util.Scanner;

public class LinkedListPalindrome {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to stop input");
        int data = 0;
        while(data != -1){
            data = sc.nextInt();
            if(data == -1) break;
            list.insertAtEnd(data);
        }
        SinglyNode fast = list.head;
        SinglyNode slow = list.head;
        if (list.head == null) {
            System.out.println("Empty List");
        } else {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        SinglyNode prev = null;
        SinglyNode curr = slow.next;
        while(curr != null){
            SinglyNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        SinglyNode first = list.head;
        SinglyNode second = prev;
        boolean flag = true;
        while(second!=null){
            if(first.data != second.data){
                flag = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        if(flag) System.out.println("List is a palindrome");
        else System.out.println("List is not a palindrome");
        sc.close();
    }
}
