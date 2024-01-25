import java.util.Scanner;

public class SumArray {
    static int Sum(int[] a, int i) {
        // if(i==(a.length-1)) return a[i]; 
        if(i==a.length) return 0;
        return a[i] + Sum(a,i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.print("Enter array: ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        }
        int Sum = Sum(a,0);
        System.out.println(Sum);
        in.close();
    }
}