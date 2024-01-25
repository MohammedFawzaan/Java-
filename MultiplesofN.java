import java.util.Scanner;

public class MultiplesofN {
    static void Mul(int n, int k){
        if(k==0) return;
        Mul(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n");
        int n = in.nextInt();
        System.out.print("enter k");
        int k = in.nextInt();
        Mul(n,k);
        in.close();
    }
}