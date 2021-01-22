import java.util.Scanner;

public class ITGUY46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int ans=0;
            for (int i = 1; i < n; i++) {
                ans+=(i*i)*2;
            }
            ans+=(n*n);
            System.out.println(ans);
        }
    }
}
