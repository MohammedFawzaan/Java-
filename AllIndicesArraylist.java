import java.util.ArrayList;

public class AllIndicesArraylist {
    static ArrayList<Integer> allindices(int[] a, int X, int i){
        if(i>=a.length) 
            return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(X==a[i])
            ans.add(i);
        ArrayList<Integer> smallans = allindices(a, X, i+1);
            ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,5,6,5,5,5,4,6};
        int X = 5;
        ArrayList<Integer> ans = allindices(a,X,0);
        // for (Integer i : ans) {
        //     System.out.println(i);
        // }
        System.out.println(ans);
    }
}