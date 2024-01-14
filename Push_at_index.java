import java.util.Stack;
import java.util.Scanner;

public class Push_at_index {
    public static Stack<Integer> push(Stack<Integer> st, int item, int idx){
        Stack<Integer> gt = new Stack<>();
        if(idx>st.size()) {
            return st;
        }
        while(st.size()>idx) {
            gt.push(st.pop());
        }
        st.push(item);
        while(gt.size()>0) {
            st.push(gt.pop());
        }
        return st;
    }
    public static Stack<Integer> PushRec(Stack<Integer> st, int idx, int x) {
        if(idx>st.size()){
            System.out.println("Can't Insert");
            return st;
        }
        if(st.size()==idx) {
            st.push(x); 
            return st;
        }
        int top = st.pop();
        PushRec(st,idx,x);
        st.push(top);
        return st;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter elements : ");
        int size = 5;
        while(st.size()<size) {
            st.push(in.nextInt());
        }
        System.out.print("Enter item & idx : ");
        int item = in.nextInt();
        int idx = in.nextInt();
        // Stack<Integer> ans = push(st, item, idx);
        Stack<Integer> ans = PushRec(st, item, idx);
        System.out.println(ans);
        in.close();
    }
}