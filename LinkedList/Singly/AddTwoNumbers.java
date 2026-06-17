public class AddTwoNumbers {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        SinglyLinkedList res = new SinglyLinkedList();
        l1.insertAtEnd(5);
        l1.insertAtEnd(4);
        l1.insertAtEnd(8);

        l2.insertAtEnd(3);
        l2.insertAtEnd(6);
        l2.insertAtEnd(2);

        SinglyNode num1 = l1.head;
        SinglyNode num2 = l2.head;
        int carry = 0;

        while(num1 != null || num2 != null){
            int sum = carry;
            if(num1 != null){
                sum += num1.data;
                num1 = num1.next; 
            }
            if(num2 != null){
                sum += num2.data;
                num2 = num2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            res.insertAtEnd(sum);
        }
        if(carry == 1) res.insertAtEnd(carry);;
        res.printList(res);
    }
}
