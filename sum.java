import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,sum=0;
        while(true) {
            a = sc.nextInt();
            if(a==0) 
                break;
            sum += a;
        }
        System.out.println(sum);
        sc.close();
    }
}