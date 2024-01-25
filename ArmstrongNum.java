import java.util.Scanner;

public class ArmstrongNum {
    static int Armstrong(int n) {
        int r = (n%10);
        if(n<=0) return 0;
        return (r*r*r) + Armstrong(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = in.nextInt();
        if(Armstrong(n)==n) {
            System.out.print("Armstrong Num");
        } else {
            System.out.println("Not");
        }
        in.close();
    }
}