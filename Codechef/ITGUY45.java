import java.util.Scanner;

public class ITGUY45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            for (int i = 0; i < (n/2)+1; i++) {
                for (int j = 0; j < (n/2)+1; j++) {
                    if(i==j) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 1; i <(n/2)+1; i++) {
                for (int j = (n/2); j > 0; j--) {
                    if(i==j) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
