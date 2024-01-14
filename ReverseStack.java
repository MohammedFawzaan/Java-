import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> ReverseIteratively(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) {
            rt.push(st.pop());
        }
        return rt;
    }
    public static Stack<Integer> pushatbottom(Stack<Integer> st, int x) { // Push the item at bottom
        if (st.size()==0) {
            st.push(x);
            return st;
        }
        int top = st.pop();
        pushatbottom(st, x);
        st.push(top);
        return st;
    }
    public static Stack<Integer> ReverseRecursively(Stack<Integer> st) {
        if(st.size()==0) return st;
        int top = st.pop();
        ReverseRecursively(st);
        pushatbottom(st,top);
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); //0                                    
        st.push(2); //1
        st.push(3); //2
        st.push(4); //3 TOP

        // Stack<Integer> gt = ReverseIteratively(st);
        // Stack<Integer> rt = ReverseIteratively(gt);
        // while(rt.size()>0)
        //     st.push(rt.pop());
        // System.out.println(st);

       ReverseRecursively(st);
       System.out.println(st);
    }
}