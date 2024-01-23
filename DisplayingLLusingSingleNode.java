public class DisplayingLLusingSingleNode 
{
    static void recursive(Node head) {
        if(head==null) 
            return;
        System.out.print(head.data + " ");
        recursive(head.next);
    }
    static void display(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(16);
        Node e = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println();
        // Normal appproach.

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println();

        // Loop approach.
        Node temp = a;
        int count = 0;
        // for(int i=0;i<5;i++) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        // System.out.println();
        // // Another approach if we dont know the tail of ll.
        while(temp!=null) {
            // System.out.print(temp.data+" ");
            temp = temp.next;
            count++;
        }
        System.out.println(count);
        // Displaying node by passing it through a function.
        // display(a);
        // recursive(a);
    }
}
