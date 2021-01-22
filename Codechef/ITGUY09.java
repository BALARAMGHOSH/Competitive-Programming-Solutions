import java.util.*;

public class ITGUY09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i]=scanner.nextInt();            
            }
            for (int i = 0; i < m; i++) {
                arr2[i]=scanner.nextInt();
            }
            findCommonElement(arr1, arr2);
            System.out.println();
        }
    }    
    
    

    public static int findCommonElement(int[] a, int[] b){
        int counter=0;
        int temp= 0;
        int tempCounter = 0;
        for(int i=0; i<a.length; i++){
            temp=a[i];
            tempCounter=0;
            for(int j=0; j<b.length; j++){
                if (temp==b[j]){
                    tempCounter++;  
                }

            }

            if (tempCounter == 1) {
                temp = a[i];

                counter++;

                System.out.print(temp+" ");

            }

        }

        return 0;
    }

}
