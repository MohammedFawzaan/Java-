// import java.util.Scanner;
// FastSlow Pointer Method used for Removing & Finding Last Node From LL.
public class FindRemoveNthElementFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data) {this.data = data;}
    }
    static void display(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static int Size(Node head){
        Node temp = head;
        int size = 0;
        while(temp!=null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    static void Find(Node head, int idx) {
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void FastSlow(Node head, int idx) {
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=idx;i++) {
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.print(slow.data);
    }
    static Node RemovefromlastFastSlow(Node head, int idx) {
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=idx;i++) {
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head; 
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        //delete n3 node = 5.
        Node n = new Node(100);  //0
        Node n1 = new Node(13); //1
        Node n2 = new Node(4);  //2
        Node n3 = new Node(5);  //3
        Node n4 = new Node(12); //4
        Node n5 = new Node(10); //5
        n.next = n1;                                // 100 13 4 5 12 10. ->
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the index which is to be finded from last : ");
        // int nth = sc.nextInt();
        // int m = Size(n);
        // int a = (m-nth+1);
        // Find(n,1);
        // FastSlow(n,5);
        // sc.close();
        Node a = RemovefromlastFastSlow(n, 6);
        display(a);
    }
}
