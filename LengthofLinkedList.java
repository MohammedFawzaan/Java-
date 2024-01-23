public class LengthofLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static int length(Node a) {
        Node temp = a;
        int count = 0;
        while(temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(9);
        a.next = b;
        Node c = new Node(8);
        b.next = c;
        int len= length(a);
        System.out.println(len);
    }
}