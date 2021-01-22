import java.util.*;

public class ITGUY19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int[] laddus=new int[n];
            for (int i= 0; i < n; i++){
                laddus[i] = scanner.nextInt();
            }
            int ans=countFreq(laddus,n);
            System.out.println(ans);
        }
    }

    public static int countFreq(int arr[], int n) 
    { 
        boolean visited[] = new boolean[n]; 
        int[] num=new int[n];
        int[] cnt=new int[n];
        
        Arrays.fill(visited, false); 
        int i;
        // Traverse through array elements and 
        // count frequencies 
        for ( i = 0; i < n; i++) { 
    
            // Skip this element if already processed 
            if (visited[i] == true) 
                continue; 
    
            // Count frequency 
            int count = 1; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] == arr[j]) { 
                    visited[j] = true; 
                    count++; 
                } 
            } 
            if (count == 1) {
                break;
            }
        } 
        return arr[i];
    } 
}
