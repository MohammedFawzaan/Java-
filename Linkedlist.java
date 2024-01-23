public class Linkedlist {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        a.next = b;
        Node c = new Node(16);
        b.next = c;
        System.out.println(a.data);     // Print the value stored at node a.
        System.out.println(a);         // Print the address of node a.
        System.out.println(a.next);   // Print the address of next node b.

        System.out.println(b.data);     // Print the value stored at node b.
        System.out.println(b);         // Print the address of node b.
        System.out.println(b.next);   // Print the address of next node c.

        System.out.println(c.data);    // Print the value stored at node c.
        System.out.println(c);        // Print the address of node c.
        System.out.println(c.next);  // Print the address of next node ie null.
    }
}