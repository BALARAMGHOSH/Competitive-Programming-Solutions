import java.util.*;

public class ITGUY17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            if (n==1) {
                System.out.println(n*k);
            } else if (n%2==0) {
                System.out.println((n/2)*k);
            } else if (n%2!=0){
                System.out.println(((n/2)+1)*k);
            }
        }
    }
}
