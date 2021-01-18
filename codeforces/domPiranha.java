import java.util.*;
import java.io.*;
import java.lang.*;


public class domPiranha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-- > 0) {
            int n=scanner.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
            }

            if (areSame(a)) {
                System.out.println(-1);
            } else {            
                System.out.println(position(a));
            }
        }
    }

    public static boolean areSame(int arr[])
    {
        // Put all array elements in a HashSet
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
 
        // If all elements are same, size of
        // HashSet should be 1. As HashSet contains only distinct values.
        return (s.size() == 1);
    }

    public static int position(int[] a){

        int max = Collections.max(Arrays.asList(a));
        int pos=0;
        int n=a.length;
        int i=0;
        while (i<n) {
            if (a[0]==max && a[0]>a[1]) {
                pos=0;
                break;
            }
            else if (a[n-1]==max && a[n-1]>a[n-1]){
                pos=n-1;
                break;
            }
            else{
                if(a[i]>a[i-1] || a[i]>a[i+1]){
                    pos=i;
                    break;
                }
            }
        }
        return pos;
    }
}
