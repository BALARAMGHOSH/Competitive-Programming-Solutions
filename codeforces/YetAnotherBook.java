import java.util.Scanner;

public class YetAnotherBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- > 0) {
            int n=scanner.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int count=minSwap(a,n);
	        System.out.println(count);
        }
    }

    static int minSwap(int arr[], int n) { 
  
        int count0=0;
        int posf=0,posl=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==1) {
                posf=i;
                break;
            }
        }
        for (int i = n-1; i >=0; i--) {
            if (arr[i]==1) {
                posl=i;
                break;
            }
        }
        
        if(posf==posl) count0=0;
        else{

            for (int i = posf; i <= posl; i++) {
                if (arr[i]==0) {
                    count0++;
                }
            }

        }

        return count0; 
    }
}
