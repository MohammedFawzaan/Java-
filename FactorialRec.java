import java.util.Scanner;

public class FactorialRec {
    static int fact(int n) {
        if(n==1) return 1;
        if(n==0) return 1;
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        int factorial = fact(a);
        System.out.println(factorial);
        sc.close();
    }
}