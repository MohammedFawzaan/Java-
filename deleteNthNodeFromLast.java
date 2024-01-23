public class deleteNthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void delete(Node head, int idx) {
        Node temp = head;
        for(int i=1; i<=(idx-1); i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        //delete n3 node = 5.
        Node n = new Node(10);  //0
        Node n1 = new Node(13); //1
        Node n2 = new Node(4);  //2
        Node n3 = new Node(5);  //3
        Node n4 = new Node(12); //4
        Node n5 = new Node(10); //5
        n.next = n1;                                // 10 13 4 5 12 10. ->
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        delete(n,3);
        display(n);
  //LL = 10 13 4 5 12 10.
  //Idx   0 1  2  3  4 5.
  //Nw = 10 13 4 12 10.
    }
}