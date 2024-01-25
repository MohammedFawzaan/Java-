import java.util.Scanner;

public class FibonacciRec {
    static int fib(int n) {
        if(n == 0 || n==1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the term : ");
        int a = sc.nextInt();
        int fibonacci = fib(a);
        for(int i=0;i<=a;i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        System.out.println("the " + a + "th term is : " + fibonacci);
        sc.close();
    }
}