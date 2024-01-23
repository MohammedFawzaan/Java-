// import java.util.LinkedList;
public class deleteNode 
{
    static class Node {
        int data;
        Node next;
        Node (int data) {
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
    static void deleteNode1(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(1);
        // ll.add(5);
        // ll.add(3);
        // ll.add(7);
        // System.out.println(ll);
        Node n = new Node(1);
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(10);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        deleteNode1(n3);
        display(n);
        System.out.println(n3.data);
    }
}