import java.util.*;

class HELPSANT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }        
        Arrays.sort(array);
        int temp=0;
        for (int i = 0; i < n; i++) {
            if(temp!=array[i]){
                System.out.print(array[i]+" ");
            }
            temp=array[i];
        }
    }
}
