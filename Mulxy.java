import java.util.Scanner;

public class Mulxy {
    static int mul = 0;
    static int Mul(int x, int y) {
        if(y==0) return y;               // 1st Approach.
        return x+Mul(x,y-1);
    }
    static int mul(int a, int b) {
        if(b==0) return mul;            // 2nd Approach.
        mul = mul + a;
        return mul(a,b-1);
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(mul(x,y));
        in.close();
    }
}
