import java.util.Scanner;

public class ITGUY47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
