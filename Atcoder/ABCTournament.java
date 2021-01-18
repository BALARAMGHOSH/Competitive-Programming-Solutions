import java.util.*;

public class ABCTournament {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long size=(long)Math.pow(2, n);
        LinkedList<Long> ll=new LinkedList<Long>();
        for (int i = 0; i < size; i++) {
            ll.add(scanner.nextLong());
        }
        while(size>=2){
            long s2=size/2;
            long[] b=new long[(int)s2];
            int k=0;
            for (int i = 0,j=1; i < n-1 && j<n; i=i+2,j=j+2) {
                b[k]=Math.max(b)
            }
        }
    }
}
