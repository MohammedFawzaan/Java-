import java.util.Scanner;
import java.util.Stack;
public class CopyStackElements {
    public static Stack<Integer> copy(Stack<Integer> a, int n) {
        Stack<Integer> b = new Stack<>();
        while(a.size()>0) {
            // int x = a.peek();
            // b.push(x);
            // a.pop();
            b.push(a.pop());
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        while(st.size()<n)
            st.push(sc.nextInt());

        Stack<Integer> rt = copy(st,n);
        System.out.println("Reverse Stack : ");
        System.out.println(rt);

        Stack<Integer> gt = copy(rt,n);
        System.out.println("Stack st elements are copied into Stack gt : ");
        System.out.println(gt);

        sc.close();
    }
}