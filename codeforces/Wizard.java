import java.util.*;

/**
 * Wizard
 */
public class Wizard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            int num=9;
            for (int i = 0; i < n; i++) {
                System.out.print(num);
                if (num==0) num=9;
                else num--;
            }
            System.out.println();   
        }
    }
}