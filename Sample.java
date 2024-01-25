public class Sample {
    public static void main(String[] args) {
        int[] a1 = {1,4,2,3};
        int[] a2 = {-4,-3,6,10,20,30};
        int d = 6;
         int n1 = a1.length;
         int n2 = a2.length;
        int count = 0;
        for(int i=0;i<n1;i++) {
            boolean flag = false;
            for(int j=0;j<n2;j++) {
                if(Math.abs(a1[i]-a2[j]) > d) {
                    flag = true;
                }
            }
            if(flag == true ) {
                count++;
            }
        }            
        System.out.println(count);
    }
}