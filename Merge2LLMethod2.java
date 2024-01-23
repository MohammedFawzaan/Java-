public class Merge2LLMethod2 {
    static class node {
        int data;
        node next;
        node(int data) { this.data = data; }
    }
    static node Merge(node h1, node h2) {
        node head = new node(100);         //Garbage value is 100 (not accessable).
        node temp = head;
        node t1 = h1, t2 = h2;
        while(t1!=null && t2!=null) {
            if(t1.data < t2.data) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1==null) temp.next = t2;
        if(t2==null) temp.next = t1;
        return head.next;
    }
    static void display(node temp) {
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }  
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(3);
        n1.next = n2;
        node n3 = new node(5);
        n2.next = n3;
        node n4 = new node(8);
        n3.next = n4;

        node a1 = new node(2);
        node a2 = new node(4);
        a1.next = a2;
        node a3 = new node(6);
        a2.next = a3;
        node a4 = new node(7);
        a3.next = a4;

        node head = Merge(n1,a1);
        display(head);
    }
}