import java.util.Scanner;

public class Orthogonality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        long[] a=new long[(int)n];
        long[] b=new long[(int)n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextLong();
            
        }
        for (int i = 0; i < n; i++) {
            b[i]=scanner.nextLong();
            
        }
        for (int i = 0; i < n; i++) {
            sum+=(a[i]*b[i]);
            
        }
            
        if (sum==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
