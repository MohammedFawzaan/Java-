import java.util.Scanner;

public class Power {
    static double pow(double p, int q) {
        if(q==0) return 1;
        return p * pow(p,q-1);
    }
    static int pow2(int p, int q) {
        if(q==0) return 1;
        int smallpow = pow2(p,q-1);
        if( q%2 ==0 ) 
        return smallpow * smallpow;
        return p * smallpow * smallpow;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter p : ");
        double p = in.nextInt();
        System.out.print("enter q : ");
        int q = in.nextInt();
        double power = pow(p,q);
        System.out.println(power);
        in.close();
    }
}