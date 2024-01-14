import java.util.Stack;

public class DisplayStack {
    public static class Node{
        int data;
        Node next;
        public Node(int data) { this.data = data; }
    }
    public static void DisplayUsingArray(Stack<Integer> st) {
        int n = st.size();
        int[] a = new int[n];
        for(int i=n-1;i>=0;i--) {
            a[i] = st.pop();
        }
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
            st.push(a[i]);
        }
        System.out.println();
    }
    public static void DisplayUsingAnotherStack(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) {
            rt.push(st.pop());
        }
        while(rt.size()>0) {
            System.out.print(rt.peek()+" ");
            st.push(rt.pop());
        }
        System.out.println();
    }
    public static void DisplayUsingLL(Stack<Integer> st) {
        Node head = null;
        Node temp = head;
        while(st.size()>0) {
            Node a = new Node(st.pop());
            a.next = temp;
            temp = a;
        } 
        head = temp;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            st.push(temp.data);
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Head of LL : "+head.data);
    }
    public static void DisplayRecursively(Stack<Integer> st) {
        if(st.size()==0) return;
        int top = st.pop();
        DisplayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void DisplayReverseRecursively(Stack<Integer> st) {
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        DisplayReverseRecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); //0
        st.push(2); //1
        st.push(3); //2
        st.push(4); //3
        st.push(5); //4 TOP
        DisplayUsingArray(st);
        DisplayUsingAnotherStack(st);
        // DisplayUsingLL(st);
        // DisplayRecursively(st);
        // DisplayReverseRecursively(st);
        System.out.println();
        System.out.println(st);
    }
}