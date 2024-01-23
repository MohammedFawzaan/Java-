public class implementation 
{
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data; 
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if(head == null) 
                head = temp;
            else
                tail.next = temp;
            tail = temp;
        }
        void insertAtBegin(int data) {
            Node temp = new Node(data);
            if(head == null) 
                head = tail = temp;
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if(idx==0) {
                insertAtBegin(data);
                return;
            }
            if(idx==size()) {
                insertAtEnd(data);
                return;
            }
            for(int i=1;i<=(idx-1);i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx) {
            Node temp = head;
            for(int i=1;i<=idx;i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx) {
            if(idx==0){
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i=1;i<=(idx-1);i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size()) {
                tail = temp;
            }
        }
        int size() {
            Node temp = head;
            int count = 0;
            while(temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        //ll.display();
        ll.insertAtBegin(13);
        //ll.display();
        ll.insertAt(2,10);
        //ll.display();
        //System.out.println(ll.size());
        ll.insertAt(5,2);
        // ll.display();
        // System.out.println(ll.tail.data);
        ll.insertAt(0,100);
        // ll.display();
        // System.out.println(ll.getAt(2));
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data);
    }
};