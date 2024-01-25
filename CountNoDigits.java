import java.util.Scanner;

public class CountNoDigits {
    static int Cod(int n) {
        if(n >= 0 && n <=9) return 1;
        return 1+ Cod(n/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = in.nextInt();
        int cod = Cod(n);
        System.out.println(cod);
        in.close();
    }
}