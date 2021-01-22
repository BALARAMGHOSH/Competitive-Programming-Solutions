import java.util.*;

public class ITGUY16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        String sa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sn="1234567891011121314151617181920212223242526";
        while (t-->0){
            int k=scanner.nextInt();
            for (int i= 0; i <k;i++){
                for (int j= (k-i-1); j >0;j--){
                    System.out.print(" ");
                }
                if (i%2==0) {
                    System.out.print(sa.substring(0,i+1));
                }else{
                    System.out.print(sn.substring(0,i+1));
                }
                System.out.println();
            }

        }
    }
}
