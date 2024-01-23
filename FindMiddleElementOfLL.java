public class FindMiddleElementOfLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    static int Middle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node n = new Node(100);  //0
        Node n1 = new Node(13); //1
        Node n2 = new Node(4);  //2
        Node n3 = new Node(5);  //3
        Node n4 = new Node(12); //4
        Node n5 = new Node(10); //5
        Node n6 = new Node(101); //5
        // Node n7 = new Node(102); //5
        n.next = n1;                                // 100 13 4 5 12 10. ->
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        // n6.next = n7;
        int a = Middle(n);
        System.out.println(a);
    }
}