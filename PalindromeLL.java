public class PalindromeLL {
    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    public static int palindrome(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        int a = palindrome(n);
        System.out.println(a);
    }
}