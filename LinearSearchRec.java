import java.util.Scanner;

public class LinearSearchRec {
    static boolean linear(int[] a, int target, int i) {
        if(i>=a.length) 
            return false;
        if(a[i]==target)
            return true;
        return linear(a,target,i+1);
    }
    static int linear2(int a[], int target, int i) {
        if(i==a.length) 
            return -1;
        if(a[i]==target) 
            return i;
        return linear2(a,target,i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter array length : ");
        int n = in.nextInt();
        System.out.print("enter array elements : ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = in.nextInt();
        } System.out.print("enter target value : ");
        int target = in.nextInt();
        // boolean b = linear(a,target,0);
        // System.out.println(b);
        int c = linear2(a,target,0);
        System.out.println(c);
        in.close();
    }
}