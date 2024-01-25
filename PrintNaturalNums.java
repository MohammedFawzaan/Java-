import java.util.Scanner;
// Recursion Print Natural Numbers from 1 to n.
public class PrintNaturalNums {
    static void Natural(int n) {
        if(n==1) {
            System.out.print(n + " ");
            return;
        }
        Natural(n-1);
        System.out.print(n + " ");
    }
    static void Naturaldec(int n) {
        if(n==1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        Naturaldec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        Natural(a);
        System.out.println();
        Naturaldec(a);
        sc.close();
    }
};