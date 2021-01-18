import java.util.Scanner;

public class DATEGIFT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t=scanner.nextShort();
        while(t-- > 0) {
            long n=scanner.nextLong();
            long temp=scanner.nextLong();
            for (int i = 2; i <= n; i++) {
                long temp2=scanner.nextLong();
                temp=temp2^temp;
            }
            System.out.println(temp);
        }
    }
}
