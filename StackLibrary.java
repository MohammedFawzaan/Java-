import java.util.Stack;

public class StackLibrary {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // 0
        st.push(20); // 1
        st.push(30); // 2
        st.push(40); // 3
        st.push(50); // 4
        System.out.println(st.peek());
        System.out.println("Stack is : "+st);
        st.pop();
        System.out.println("Stack is : "+st);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}