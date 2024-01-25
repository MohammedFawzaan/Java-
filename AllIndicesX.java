import java.util.Scanner;

public class AllIndicesX {
    static void fun(int[] a, int X, int i) {
        if(i==a.length) 
            return;
        if(X==a[i]) 
            System.out.print(i+" ");
        fun(a,X,i+1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter array : ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        } System.out.print("enter X : ");
        int X = sc.nextInt();
        System.out.println();
        fun(a,X,0);
        sc.close();
    }
}