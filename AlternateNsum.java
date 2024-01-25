import java.util.Scanner;

public class AlternateNsum {
    static int alt(int n) {
        if(n==1) return n;
        if(n%2==0)
            return (alt(n-1) - n);
        return (alt(n-1) + n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n");
        int n = in.nextInt();
        int ans = alt(n);
        in.close();
        System.out.println(ans);
    }
}