public class RemoveDuplicatesFromLL {
    public static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    public static Node deleteDuplicates(Node head) {
        Node temp = head;
        if(head==null) return null;
        if(head.next==null) return head;
        while(temp!=null && temp.next!=null) {
            if(temp.val != temp.next.val)
                temp = temp.next;
            else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        n.next = n1;
        Node n2 = new Node(3);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        Node n5 = new Node(4);
        n4.next = n5;
        display(n);
        deleteDuplicates(n);
        display(n);
    }
}