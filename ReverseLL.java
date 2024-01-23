public class ReverseLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node reverseIterative(Node head) {
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while(curr!=null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public static Node reverseRecLL(Node head) {
        if(head.next==null) return head;  // Base case.
        Node newhead =  reverseRecLL(head.next);
        head.next.next = head;            // Interchanging Connections.
        head.next = null;
        return newhead;
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        n.next = n1;
        Node n2 = new Node(3);
        n1.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        System.out.println();
        // Node r = reverseRecLL(n);
        // display(r);
        Node r1 = reverseIterative(n);
        display(r1);
    }
}