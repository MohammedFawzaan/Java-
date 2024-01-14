public class StackImplementationLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int item) {
            Node a = new Node(item);
            a.next = head;
            head = a;
            size++;
        }
        int pop() {
            if(head==null) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int x = head.data;
                head = head.next;
                size--;
                return x;
            } 
        }
        int peek() {
            if(head==null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.data;
        }
        int size() {
            return size;
        }
        void displayrec(Node temp) {
            if(temp==null) return;
            displayrec(temp.next);
            System.out.print(temp.data+" ");
        }
        void display() {
            displayrec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);  // 0
        st.push(8);  // 1
        st.push(9);  // 2
        st.push(10); // 3 TOP
        System.out.println("Top item : "+st.peek());
        System.out.println("Size of Stack : "+st.size());
        st.display();

        System.out.println("Item poped : "+st.pop());
        System.out.println("Top item : "+st.peek());
        System.out.println("Size of Stack : "+st.size());
        st.display();

        System.out.println("Item poped : "+st.pop());
        System.out.println("Item poped : "+st.pop());
        System.out.println("Item poped : "+st.pop());
        System.out.println("Item poped : "+st.pop());
    }
}