public class LastIndex {
    static int Lastindex(int[] a, int x, int i){
        if(x == a[i]) return i;
        return Lastindex(a,x,i-1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,2,3};
        int x = 2;
        System.out.println(Lastindex(a,x,(a.length-1)));
    }
}