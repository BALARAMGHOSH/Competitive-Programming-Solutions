import java.util.*;

class SUBTRACT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        for (int i=0; i<k; i++){
            if (n%10!=0) {
                n=n-1;
            }else{
                n=n/10;
            }
        }       
        System.out.println(n);
    }
}
