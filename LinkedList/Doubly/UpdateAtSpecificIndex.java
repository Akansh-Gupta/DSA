public class UpdateAtSpecificIndex {
    static void update(DoublyLinkedList list, int index, int val) {
        DoublyNode temp = list.head;
        int count = 1;
        while (temp != null && count <= index) {
            temp = temp.next;
            count++;
        }
        if(temp == null){
            System.out.println("\nCannot update element. Invalid index.");
        }else{
            temp.data = val;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
        System.out.println();
        
        update(list, 3, 9999);
        list.printList(list);


    }
}
