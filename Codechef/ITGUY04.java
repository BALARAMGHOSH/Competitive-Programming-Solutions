import java.util.Scanner;

public class ITGUY04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            long n=scanner.nextLong();
            if (n==0) {
                System.out.println(0);
            } else {
                int num=0;
                for (int i = 1; i < n; i++) {
                    num+=(i*i);
                }
                System.out.println(num);
            }
        }
    }
}
