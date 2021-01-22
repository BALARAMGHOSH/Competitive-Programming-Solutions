import java.util.*;

public class ITGUY14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            int[] array=new int[n];
            int[] array2=new int[n];

            for (int i=0; i < n; i++){
                array[i]=scanner.nextInt();
            }
            
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (array[j]==i) {
                        array2[i]=i;
                        break;
                    }
                }
            }            

            for (int i = 0; i < n; i++){
                System.out.print(array2[i]+" ");
            }
            System.out.println();
        }
    }
}
