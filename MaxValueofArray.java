import java.util.Scanner;

public class MaxValueofArray {
    static int MaxArray(int max, int[] a, int i) {
        if(i==a.length) return max;
        if(a[i]>max) 
            max=a[i];
        return MaxArray(max,a,i+1);
    }
    static int MaxinArr(int[] a, int i) {
        if(i==(a.length-1)) return a[i];
        int small = MaxinArr(a,i+1);
        return Math.max(small, a[i]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array");
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        }
        // int max = MaxArray(a[0],a,0);
        // System.out.println(max);
        int max =MaxinArr(a,0);
        System.out.print(max);
        in.close();
    }
}