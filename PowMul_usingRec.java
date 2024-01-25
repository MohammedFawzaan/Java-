public class  PowMul_usingRec {
    static int ans = 1, mul = 0;
    public static int pow(int x, int n) {
        if(n==0) return ans;
        ans *= x;
        return pow(x,n-1);
    }
    public static int Mul(int a, int b) {
        if(b==0) return mul;
        mul += a;
        return Mul(a,b-1);
    }
    public static void main(String[] args) {
        int x = 3, n = 9;  
        // For x power n ie : 3 power 9.
        int a = pow(x,n);
        // For x Multiply n ie : 3*9
        int m = Mul(x,n);
        System.out.println(a);
        System.out.println(m);
    }
}