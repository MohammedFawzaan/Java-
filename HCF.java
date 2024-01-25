import java.util.Scanner;

public class HCF {
    static int GCD(int n1, int n2) {
        if(n2==0) return n1;
        return GCD(n2,(n1%n2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n1 : ");
        int n1 = in.nextInt();
        System.out.print("enter n2 : ");
        int n2 = in.nextInt();
        int gcd = GCD(n1,n2);
        System.out.println(gcd);
        // for(int i=1;i<=n1;i++) {
        //     if(n1%i==0 && n2%i==0) {
        //         System.out.print(i+" ");
        //     }
        //     else 
        //      continue;
        // }
        in.close();
    }
}