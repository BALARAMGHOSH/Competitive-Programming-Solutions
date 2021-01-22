import java.util.Scanner;

public class ITGUY07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t=scanner.nextLong();
        while(t-->0){
            long n=scanner.nextLong();
            long ans=0;
            if (n==0) {
                System.out.println(0);
            } else {
                for (long i = 1; i < n; i++) {
                    ans+=i;
                }
                System.out.println(ans);
            }
            
        }
    }
}
