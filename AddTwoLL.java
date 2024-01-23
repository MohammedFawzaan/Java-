public class AddTwoLL {
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }
    static void display(Node temp) {
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    } 
    public static void addTwoNumbers(Node l1, Node l2) {
        Node temp1 = l1;
        Node temp2 = l2;
        Node Head = new Node(100);
        Node Temp = Head;
        while(temp1!=null) {
            Node a = new Node(temp1.val);
            Temp.next = a;
            Temp = a;
            temp1 = temp1.next;
        }
        while(temp2!=null) {
            Node a = new Node(temp2.val); 
            Temp.next = a;
            Temp = a;
            temp2 = temp2.next;
        }
        display(Head.next);
    }
    public static void main(String[] args) {
        Node n = new Node(2);
        Node n1 = new Node(4);
        n.next = n1;
        Node n2 = new Node(3);
        n1.next = n2;
        Node a = new Node(5);
        Node a1 = new Node(6);
        a.next = a1;
        Node a2 = new Node(4);
        a1.next = a2;
        addTwoNumbers(n, a);
    }
}