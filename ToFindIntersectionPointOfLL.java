public class ToFindIntersectionPointOfLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static int getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int n = Size(headA);
        int m = Size(headB);
        for(int i=1;i<=(m-n);i++) {
            temp2 = temp2.next;
        }
        while(temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.val;
    }
    public static int Size(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode c1 = new ListNode(10);
        ListNode c2 = new ListNode(20);
        ListNode c3 = new ListNode(30);
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(5);
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        int d =  getIntersectionNode(a1, b1);
        System.out.println(d);
    }
}