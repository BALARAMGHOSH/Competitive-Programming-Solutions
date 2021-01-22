import java.util.*;

public class ITGUY08 {

    static void printUncommon(int arr1[],  
                     int arr2[], int n1, int n2) 
    { 
  
        int i = 0, j = 0, k = 0; 
        while (i < n1 && j < n2) { 
  
            // If not common, print smaller 
            if (arr1[i] < arr2[j]) { 
                System.out.print(arr1[i] + " "); 
                i++; 
                k++; 
            } 
            else if (arr2[j] < arr1[i]) { 
                System.out.print(arr2[j] + " "); 
                k++; 
                j++; 
            } 
  
            // Skip common element 
            else { 
                i++; 
                j++; 
            } 
        } 
  
        // printing remaining elements 
        while (i < n1) { 
            System.out.print(arr1[i] + " "); 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            System.out.print(arr2[j] + " "); 
            j++; 
            k++; 
        } 
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int[] ns=new int[n];
            for (int i = 0; i < n; i++) {
                ns[i] = scanner.nextInt();
            }
            int[] ms=new int[m];
            for (int i = 0; i < m; i++) {
                ms[i]= scanner.nextInt();
            }
            printUncommon(ns, ms, n, m); 
            System.out.println();
        }
    }
}
