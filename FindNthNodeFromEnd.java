public class FindNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node (int data) { this.data = data; }
    }
    //     Mathematical Approach.
    // public static Node nth(Node head, int n) {
    //     int size = 0;
    //     Node temp = head;
    //     while(temp!=null) {
    //         size++;
    //         temp = temp.next;
    //     }
    //     int m = size - n + 1;
    //     temp = head;
    //     for(int i=1;i<(m);i++) {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
        //     Optimised Approach and easy one.
    public static Node nth2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++) {
            fast = fast.next;
        } 
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }    
    public static void nthdelete(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++) {
            fast = fast.next;
        } 
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }
    static void display(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node n = new Node(3);
        Node n1 = new Node(4);
        n.next = n1;
        Node n2 = new Node(5);
        n1.next = n2;
        Node n3 = new Node(6);
        n2.next = n3;     
        Node n4 = new Node(7);
        n3.next = n4;
        Node n5 = new Node(8);
        n4.next = n5;
    //Node 3 4 5 6 7 8  
        // 0 1 2 3 4 5 
        // 1 2 3 4 5 6 
        // 6 5 4 3 2 1 
        Node q = nth2(n,4);
        System.out.println(q.data);
        // nthdelete(n,4);
        // display(n);
    }
}