public class StackImplementationArray {
    static class Stack{
        int top = -1;
        int n = 5;
        int[] stack = new int[n];
        void push(int item) {
            if(isFull()) System.out.println("Overflow");
            top++;
            stack[top] = item;
        }   
        void pop() {
            if(isEmpty()) System.out.println("Underflow");
            top--;
        }
        int peek() {
            System.out.println();
            if(top==-1) return -1;
            return stack[top];
        }
        void display() {
            if(isEmpty()) System.out.println("Underflow");
            else {
                System.out.println("The items Present in Stack");
                for(int i=top;i>=0;i--) {
                    System.out.println(stack[i]);
                }
                System.out.println();
            }
        }
        boolean isEmpty() {
            if(top == -1) return true; 
            else return false;
        }
        boolean isFull() {
            if(top == n-1) return true; 
            else return false;
        }
    }
   public static void main(String[] args) {
    Stack st = new Stack();
    st.push(50); // 0 
    st.push(40); // 1
    st.push(30); // 2
    st.push(20); // 3
    st.push(10); // 4 TOP
    System.out.println("Top item : "+st.peek());
    st.display();

    st.pop();
    System.out.println("Top item : "+st.peek());
    st.display();

    st.pop();
    System.out.println("Top item : "+st.peek());
    st.display();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
   }
}