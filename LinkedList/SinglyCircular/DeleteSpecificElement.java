public class DeleteSpecificElement {
    static void deleteSpecific(SinglyCircularLinkedList list, int val) {
        SinglyCircularNode temp = list.head;
        while(temp.next!=list.head && temp.next.data!=val){
            temp = temp.next;
        }
        if(temp == list.head){
            System.out.println("Element doesn't exist in list");
        }else{
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.insert(100);
        list.printList(list);

        deleteSpecific(list, 50);
        list.printList(list);
    }
}
