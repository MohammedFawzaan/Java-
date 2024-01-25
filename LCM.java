import java.util.Scanner;

public class LCM {
    static int GCD(int n1, int n2) {
        if(n2==0) return n1;
        return GCD(n2,(n1%n2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int lcm = (x*y) / GCD(x,y);
        System.out.println(lcm);
        in.close();
    }
}