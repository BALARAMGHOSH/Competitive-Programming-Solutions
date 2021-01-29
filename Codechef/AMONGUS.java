import java.util.*;

class AMONGUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array1=new int[n];
        int[] array2=new int[n+1];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }  
        for (int i = 0; i < (n+1); i++) {
            array2[i] = scanner.nextInt();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean bool=true;
        int ans=0;
        for (int i = 0; i < n; i++) {
            if (array1[i] != array2[i]) {
                ans=array2[i];
                bool=false;
                break;
            }
        }
        if (bool==true) {
            System.out.println(array2[n]);
        }else{
            System.out.println(ans);
        }
    }
}
