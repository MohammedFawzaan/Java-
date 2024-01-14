import java.util.Scanner;
import java.util.Stack;

public class Pop_at_index{
    public static Stack<Integer> Pop(Stack<Integer> st, int idx) {
        Stack<Integer> gt = new Stack<>();
        while(st.size()>idx+1) {
            gt.push(st.pop());
        }
        st.pop();
        while(gt.size()>0) {
            st.push(gt.pop());
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1); // 0
        st.push(2); // 1
        st.push(3); // 2
        st.push(4); // 3
        st.push(5); // 4
        st.push(6); // 5 TOP
        System.out.print("Enter the index whose item you want to delete : ");
        int idx = sc.nextInt();
        Stack<Integer> ans = Pop(st,idx);
        System.out.println(ans);
        sc.close();
    }
}