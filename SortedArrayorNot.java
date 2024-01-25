public class SortedArrayorNot {

    static boolean rec(int[] a, int i) {
        if(i==(a.length)) 
            return true;
        if((i+1)<a.length && a[i]>a[i+1]) 
            return false;
        return rec(a,i+1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,2,4};
        boolean b = rec(a,0);
        System.out.println(b);
    }
}