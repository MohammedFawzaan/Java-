public class PowerOfThree {
    static int ans = 1;
    static int pow(int a, int b) {
        if(b==0) return ans;
        ans *= a;
        return pow(a,b-1);
    }
    public static void main(String[] args) {
        int n = 243;
        int x = 0;
        while(x<n/2) {
            if(n==pow(3, x)) {
                System.out.print(x); 
                break;
            }
            x++;
        }
        // int x = 0;
        // while (pow(3, x) < n) {
        //     x++;
        // }

        // if (pow(3, x) == n) {
        //     System.out.println(x);
        // } else {
        //     System.out.println("Not a power of 3");
        // }
        // int p = pow(3,5);
        // System.out.println(p);
    }
}