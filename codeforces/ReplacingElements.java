import java.util.*;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-- > 0) {
            int n=scanner.nextInt();
            int d=scanner.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
            }
            Arrays.sort(a);
            if (solve(a,n,d)==true) {
                System.out.println("YES");                
            } else {
                System.out.println("NO");
            } 
        }
    }
    public static boolean solve(int[] a,int n,int d){
        boolean flag = false;
        if (a[n-1]<=d) {
            flag=true;
        } else {
            int x=a[0]+a[1];
            if (x>d) flag=false;
            else flag=true;
        }
        return flag;
    }
}
