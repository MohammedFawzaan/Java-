public class DisplayingLLmethods {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void displayRec(ReverseLL.Node r) {
        if(r == null) return;
        System.out.print(r.data+" ");
        displayRec(r.next);
    }
    public static void reverseRec(Node head) {
        if(head == null) return;
        reverseRec(head.next);
        System.out.print(head.data+" ");
    }
    public static void reverseIterative(Node head) {
        
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
        reverseRec(n);
    }
}