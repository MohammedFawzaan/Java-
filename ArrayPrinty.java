import java.util.Scanner;

public class ArrayPrinty {
    static void Print(int[] a, int i) {
        if(a.length==i) return;
        System.out.print(a[i]+" ");
        Print(a,i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        }
        Print(a,0);
        in.close();
    }
}