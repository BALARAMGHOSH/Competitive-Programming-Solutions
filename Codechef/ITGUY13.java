import java.util.*;

public class ITGUY13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int k=scanner.nextInt();
            int n=scanner.nextInt();
            int[] ns=new int[n];
            for (int i= 0; i < n; i++)
                ns[i] = scanner.nextInt();
            int first=0,last=0;
            for (int i= 0; i <n;i++){
                if (ns[i]==k) {
                    first=i;
                    break;
                }
            }
            for (int i= n-1; i >= 0 ; i--){
                if (ns[1]==k) {
                    last=i;
                    break;
                }
            }
            if (first==last) {
                System.out.println(-1);
            }else{
                System.out.println(first+" "+last);
            }
        }
    }
}
