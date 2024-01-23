public class CycleLinkedLink {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    static boolean cycleLinked(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) 
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node n = new Node(9);
        Node n1 = new Node(7);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(1);
        n.next = n1;                 // 9->7->3->2->1
        n1.next = n2;              //      int main
        n2.next = n3;            //        
        n3.next = n4;
        n3.next = n1;
        boolean flag = cycleLinked(n) ;
        System.out.println(flag);
    }
}
  