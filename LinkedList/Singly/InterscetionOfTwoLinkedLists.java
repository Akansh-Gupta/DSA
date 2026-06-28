public class InterscetionOfTwoLinkedLists {
    private int listLength(SinglyNode head) {
        SinglyNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public SinglyNode getIntersectionNode(SinglyNode headA, SinglyNode headB) {
        int lenA = listLength(headA);
        int lenB = listLength(headB);

        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public static void main(String[] args) {
        
    }
}
