import java.util.*;

public class ITGUY00 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int ans=0;
            for (int i = 0; i < n; i++) {
                int num=scanner.nextInt();
                if (num<=6) {
                    ans+=num;
                } else {
                    if (num%6==0) {
                        ans+=6;
                    } else {
                        ans+=(num%6);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
