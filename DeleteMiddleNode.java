public class DeleteMiddleNode 
{
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    static void display(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void Middle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.data = slow.next.data;
        slow.next = slow.next.next;
    }
    public static void main(String[] args) {
        Node n = new Node(1); 
        Node n1 = new Node(5); 
        Node n2 = new Node(10); 
        Node n3 = new Node(13);  
        Node n4 = new Node(12); 
        // Node n5 = new Node(15); 
        n.next = n1;                               
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        // n4.next = n5;
        Middle(n);
        display(n);
    }
}
