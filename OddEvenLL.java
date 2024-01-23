public class OddEvenLL {
    static class node {
        int data;
        node next;
        node(int data) { this.data = data; }
    }
    static void display(node temp) {
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void ll(node head) {
        node temp = head;
        node h = new node(100);      //Garbage value is 100 (not accessable).
        node t = h;
        while(temp!=null) {
            if(temp.data%2!=0) {
                node a = new node(temp.data);
                t.next = a;
                t = a;
            }
            temp = temp.next;
        }
        temp = head;
        node h1 = new node(200);
        node t1 = h1;
        while(temp!=null) {
            if(temp.data%2==0) {
                node b = new node(temp.data);
                t1.next = b;
                t1 = b;
            }
            temp = temp.next;
        }
        t.next = h1.next;
        display(h.next);
    }
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        n1.next = n2;
        node n3 = new node(3);
        n2.next = n3;
        node n4 = new node(4);
        n3.next = n4;
        node n5 = new node(5);
        n4.next = n5;
        ll(n1);
    }
}