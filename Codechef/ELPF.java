import java.util.*;

public class ELPF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- > 0) {
            int n=scanner.nextInt();
            int[] students=new int[n];
            for (int i = 0; i < n; i++) {
                students[i]=10;
            }
            int m=scanner.nextInt();
            int[] arrayi=new int[m];
            int[] arrayj=new int[m];
            int[] arrayk=new int[m];
            for (int i = 0; i < m; i++) {
                arrayi[i]=scanner.nextInt();
                arrayj[i]=scanner.nextInt();
                arrayk[i]=scanner.nextInt();                
            }
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    int temp=i+1;
                    if (temp>=arrayi[i] && temp<=arrayj[i]) {
                        students[j]=students[j]*arrayk[i];
                    }
                    System.out.print(students[j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            int sum=0;
            for (int i = 0; i < m; i++) {
                sum+=students[i];
            }
            System.out.println(sum/n);
        }
    }
}
