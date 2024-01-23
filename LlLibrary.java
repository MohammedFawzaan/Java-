import java.util.LinkedList;
import java.util.Scanner;

public class LlLibrary {
    public static void main(String[] args) {
        LinkedList<Integer> ll  = new LinkedList<>();
        ll.add(2);
        ll.add(3);
        System.out.println("Linked List : "+ ll);

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            ll.add(sc.nextInt());
        }
        System.out.println("Ll : "+ ll);
        sc.close();
    }
}