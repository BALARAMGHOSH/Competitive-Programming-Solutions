import java.util.*;

class PROBRGN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int ans=0;
            for (int i= 1; i <=(n-1);i++){
                for (int j= i+1; j <=n;j++){
                    ans=Math.max(ans,gcdfn(i,j));
                }
            }
            System.out.println(ans);
        }

    }

    static int gcdfn(int a,int b) {
        int gcd=1;
        for (int i= 1; i <= a && i<=b;i++){
            if (a%i==0 && b%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
}
