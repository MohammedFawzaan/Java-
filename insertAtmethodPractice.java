public class insertAtmethodPractice {
    static class Node {
        int data ;
        Node next;
        Node(int data) { this.data = data; }
    }
    static void display(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        } System.out.println();
    }
    static void insertAt(Node head, int idx) {
        Node t = new Node(10);
        Node temp = head;
        for(int i=1;i<=(idx-1);i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        display(head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node n = new Node (2);
        Node n1 = new Node (3);
        Node n2 = new Node (4);
        Node n3 = new Node (5);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        insertAt(n, 1);
    }
}