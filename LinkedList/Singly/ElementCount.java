public class ElementCount {
    static int count(SinglyLinkedList list){
        SinglyNode temp = list.head;
        int count = 0;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);

        System.out.println("No. of elements : " + count(list));
    }
}